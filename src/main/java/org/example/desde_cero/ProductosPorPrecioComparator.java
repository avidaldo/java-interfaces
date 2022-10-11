package org.example.desde_cero;


import org.example.desde_cero.libreria.ProductosComparator;

public class ProductosPorPrecioComparator implements ProductosComparator {

    @Override
    public boolean esMayor(Producto p1, Producto p2) {
        return p1.getPrecio() > p2.getPrecio();
    }
}
