package org.example.desde_cero;


import org.example.desde_cero.libreria.ProductosComparator;

public class ProductosPorVentasComparator implements ProductosComparator {

    @Override
    public boolean esMayor(Producto p1, Producto p2) {
        return p1.getVentas() > p2.getVentas();
    }
}
