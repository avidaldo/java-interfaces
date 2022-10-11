package org.example.desde_cero.libreria;


import org.example.desde_cero.Producto;

import java.util.Arrays;

public final class LibreriaOrdenarProductos {

    public static void ordenarIntsBurbuja(Integer[] data) {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length - 1; j++) {
                if (data[j] > data[j + 1]) { // Comparamos un elemento con el siguiente
                    Integer temp = data[j]; // y si es mayor, lo intercambiamos
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
    }

    /** main para testear la ordenación por burbuja */
    public static void main(String[] args) {
        Integer[] vals = {15, 60, 8, 16, 44, 27, 12, 35};
        LibreriaOrdenarProductos.ordenarIntsBurbuja(vals);
        System.out.println("\nLista de ints ordenada: " + Arrays.toString(vals));
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

    public static void ordenarProductos(Producto[] data, ProductosComparator comparator) {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length - 1; j++) {
                if (comparator.esMayor(data[j], data[j + 1])) { // Se pasa el comparador como segundo parámetro
                    Producto temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
    }


}
