package org.example.con_api;

class Producto implements Comparable<Producto> {

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
    public int compareTo(Producto otro) {
        return Integer.compare(precio, otro.getPrecio());
        //return Integer.compare(ventas, otro.getVentas());
    }

}
