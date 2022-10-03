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
                if (data[j].esMayor(data[j + 1])) {
                    ProductoComparable temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
    }


}
