package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        ordenaPersonasConSort();

/*        Integer[] vals = {15, 60, 8, 16, 44, 27, 12, 35};
        burbuja(vals);
        for (Integer val : vals) {
            System.out.println(val);
        }*/






    }



    public static void burbuja(Integer[] data) {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length - 1; j++) {
                if (data[j] > data[j + 1]) {
                    Integer temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
    }

    public static void burbujaPersonas(Persona[] data) {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length - 1; j++) {
                if (data[j].esMayor(data[j + 1])) {
                    Persona temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
    }








    public static void ordenaPersonasConSort() {
        ArrayList<Persona> al = new ArrayList<Persona>();
        al.add(new Persona("Alan Turin", LocalDate.of(1986, 4, 2)));
        al.add(new Persona("Alejandro Vidal", LocalDate.of(1986, 4, 18)));
        al.add(new Persona("María ", LocalDate.of(1986, 4, 18)));


        //Collections.sort(al);
        burbujaPersonas((Persona[]) al.toArray());

        System.out.println(al);
    }

}