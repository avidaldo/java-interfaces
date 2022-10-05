package org.example;

import org.example.FromScratch.ProductoComparable;

public final class LibreriaOrdenar {

    public static void ordenarIntsBurbuja(Integer[] data) {
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

    public static void ordenarProductos(ProductoComparable[] data) {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length - 1; j++) {
                if (data[j].esMayor(data[j + 1])) {   // Necesitamos los objetos a comparar tengan el método "esMayor()"
                    ProductoComparable temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
    }


/*    public void bubbleSortArrayList(List<Element> list) {
        Element temp;
        boolean sorted = false;

        while (!sorted) {
            sorted = true;
            for (int i = 0; i < list.size()-1; i++) {
                if (list.get(i).compareTo(list.get(i + 1)) > 0) {
                    temp = list.get(i);
                    list.set(i, list.get(i + 1));
                    list.set(i + 1, temp);
                    sorted = false;
                }
            }
        }
    }*/


}
