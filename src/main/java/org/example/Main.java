package org.example;


import org.example.FromScratch.Producto;

import java.util.Arrays;

class Main {
    public static void main(String[] args) {


/*        Integer[] vals = {15, 60, 8, 16, 44, 27, 12, 35};
        burbuja(vals);
        for (Integer val : vals) {
            System.out.println(val);
        }*/

        Producto[] productos = new Producto[5];

        Producto p1 = new Producto("P1", 500);
        p1.setVentas(1000);
        Producto p2 = new Producto("P2", 400);
        p2.setVentas(2000);
        Producto p3 = new Producto("P3", 300);
        p3.setVentas(3000);
        Producto p4 = new Producto("P4", 200);
        p4.setVentas(4000);
        Producto p5 = new Producto("P5", 100);
        p5.setVentas(5000);


        productos[0] = p3;
        productos[1] = p4;
        productos[2] = p5;
        productos[3] = p2;
        productos[4] = p1;




        System.out.println("Lista antes de ordenar: " + Arrays.toString(productos));

        LibreriaOrdenar.ordenarProductos(productos);

        System.out.println("Lista ordenada:         " + Arrays.toString(productos));

    }






}