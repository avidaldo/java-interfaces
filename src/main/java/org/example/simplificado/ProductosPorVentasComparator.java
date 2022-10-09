package org.example.simplificado;


public class ProductosPorVentasComparator implements ProductosComparator{

    @Override
    public boolean esMayor(Producto p1, Producto p2) {
        return p1.getVentas() > p2.getVentas();
    }
}
