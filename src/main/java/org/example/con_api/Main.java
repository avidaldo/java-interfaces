package org.example.con_api;

import org.example.simplificado.LibreriaOrdenarProductos;
import org.example.simplificado.ProductosComparator;

import java.util.Arrays;
import java.util.Comparator;


class Main {

    public static void main(String[] args) {

        Producto[] productos = new Producto[5];

        Producto p1 = new Producto("P1", 300);
        p1.setVentas(1000);
        Producto p2 = new Producto("P2", 400);
        p2.setVentas(2000);
        Producto p3 = new Producto("P3", 200);
        p3.setVentas(3000);
        Producto p4 = new Producto("P4", 500);
        p4.setVentas(4000);
        Producto p5 = new Producto("P5", 100);
        p5.setVentas(5000);

        productos[0] = p3;
        productos[1] = p4;
        productos[2] = p5;
        productos[3] = p2;
        productos[4] = p1;


        System.out.println("\nLista antes de ordenar:                " + Arrays.toString(productos));

        /* Ordenando usando ordenación natural de Producto (la que se ha definido implementando Comparable) */
        Arrays.sort(productos);
        System.out.println("Ordenada por orden natural:            " + Arrays.toString(productos));

        /* Ordenando comparador que tomar el orden natural invertido */
        Arrays.sort(productos, Comparator.reverseOrder());
        System.out.println("Ordenada por orden invertido:          " + Arrays.toString(productos));

        /* Ordenando mediante comparadores concretos */
        Arrays.sort(productos, new ProductoByVentasComparator());
        System.out.println("Ordenada con comparador por ventas:    " + Arrays.toString(productos));
        Arrays.sort(productos, new ProductoByPrecioComparator());
        System.out.println("Ordenada con comparador por precio:    " + Arrays.toString(productos));


        Arrays.sort(productos, new Comparator<Producto>() {
            @Override
            public int compare(Producto o1, Producto o2) {
                return Integer.compare(o1.getPrecio(), o2.getPrecio());
            }
        });
        System.out.println("Ordenada con clase anónima por ventas: " + Arrays.toString(productos));

        Arrays.sort(productos, (o1, o2) -> Integer.compare(o1.getPrecio(), o2.getPrecio()));
        System.out.println("Ordenada con lambda por precio:        " + Arrays.toString(productos));

        Arrays.sort(productos, Comparator.comparingInt(Producto::getPrecio));
        System.out.println("Ordenada con comparingInt por precio:  " + Arrays.toString(productos));


    }


}