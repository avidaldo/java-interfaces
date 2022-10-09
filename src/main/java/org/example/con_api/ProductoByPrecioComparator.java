package org.example.con_api;

import java.util.Comparator;

public class ProductoByPrecioComparator implements Comparator<Producto> {

    @Override
    public int compare(Producto o1, Producto o2) {
        return Integer.compare(o1.getPrecio(), o2.getPrecio());
    }
}
