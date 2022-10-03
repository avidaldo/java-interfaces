package org.example;


import org.example.FromScratch.Producto;

class Main {
    public static void main(String[] args) {


/*        Integer[] vals = {15, 60, 8, 16, 44, 27, 12, 35};
        burbuja(vals);
        for (Integer val : vals) {
            System.out.println(val);
        }*/


        Producto[] productos = new Producto[]{
                new Producto("Samsung Galaxy A12", 200),
                new Producto("Xiaomi Redmi 9 ", 120),
                new Producto("Xiaomi Redmi 9A", 150)
        };


        LibreriaOrdenar.ordenarProductos(productos);

        System.out.println(productos);

    }






}