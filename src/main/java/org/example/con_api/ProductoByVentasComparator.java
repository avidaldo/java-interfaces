package org.example.con_api;

import java.util.Comparator;

public class ProductoByVentasComparator implements Comparator<Producto> {

    @Override
    public int compare(Producto o1, Producto o2) {
        return Integer.compare(o1.getVentas(), o2.getVentas());
    }
}
