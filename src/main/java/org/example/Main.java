package org.example;

public class Main {
    public static void main(String[] args) {


/*        Integer[] vals = {15, 60, 8, 16, 44, 27, 12, 35};
        burbuja(vals);
        for (Integer val : vals) {
            System.out.println(val);
        }*/


        EmpleadoCustomComparable[] personas = new EmpleadoCustomComparable[]{
                new EmpleadoCustomComparable("Alan Turin", 1986),
                new EmpleadoCustomComparable("Alejandro Vidal", 1987),
                new EmpleadoCustomComparable("María ", 1982)
        };


        ordenaPersonasPorFechaNacimiento(personas);

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

    public static void burbujaPersonas(PersonaCustomComparable[] data) {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length - 1; j++) {
                if (data[j].esMayor(data[j + 1])) {
                    EmpleadoCustomComparable temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
    }


    public static void ordenaPersonasPorFechaNacimiento(EmpleadoCustomComparable[] personas) {


        //Collections.sort(al);
        burbujaPersonas(personas);

        System.out.println(al);
    }

}