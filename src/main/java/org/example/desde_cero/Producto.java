package org.example.desde_cero;

import org.example.desde_cero.libreria.ProductoComparable;

public class Producto implements ProductoComparable {

    private enum Orden {PRECIO, VENTAS}
    public static final Orden TEST_ORDEN_NATURAL = Orden.PRECIO;

    private final String nombre;
    private Integer precio;
    private int ventas = 0;

    public Producto(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public void setVentas(int ventas) { this.ventas = ventas; }
    public int getVentas() { return ventas; }
    public String getNombre() { return nombre; }
    public Integer getPrecio() { return precio; }
    public void setPrecio(Integer precio) { this.precio = precio; }

    @Override
    public String toString() {
        return nombre + " (" + precio + "€ - " + ventas + " ven.)";
    }



    @Override
    public boolean esMayor(ProductoComparable otroProducto) {
        boolean resultado = false;
        switch (TEST_ORDEN_NATURAL) {
            case PRECIO -> resultado = precio > ((Producto) otroProducto).getPrecio();
            case VENTAS -> resultado = ventas > ((Producto) otroProducto).getVentas();
        }

        return resultado;
    }

}
