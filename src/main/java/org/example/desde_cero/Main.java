package org.example.desde_cero;

import java.util.Arrays;

import static org.example.desde_cero.Producto.TEST_ORDEN_NATURAL;


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



        System.out.println("Lista antes de ordenar:                " + Arrays.toString(productos));

        LibreriaOrdenarProductos.ordenarProductos(productos);
        System.out.println("Lista por orden natural ("+TEST_ORDEN_NATURAL+"):      " + Arrays.toString(productos));

        LibreriaOrdenarProductos.ordenarProductos(productos, new ProductosPorVentasComparator());
        System.out.println("Ordenada con comparador por ventas:    " + Arrays.toString(productos));

        LibreriaOrdenarProductos.ordenarProductos(productos, new ProductosPorPrecioComparator());
        System.out.println("Ordenada con comparador por precio:    " + Arrays.toString(productos));

        LibreriaOrdenarProductos.ordenarProductos(productos, new ProductosComparator() {
            @Override
            public boolean esMayor(Producto p1, Producto p2) {
                return p1.getVentas() > p2.getVentas();
            }
        });
        System.out.println("Ordenada con clase anónima por ventas: " + Arrays.toString(productos));

        LibreriaOrdenarProductos.ordenarProductos(productos, (p11, p21) -> p11.getPrecio() > p21.getPrecio());
        System.out.println("Ordenada con lambda por precio:        " + Arrays.toString(productos));


    }


}