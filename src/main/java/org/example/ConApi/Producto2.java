package org.example.ConApi;

public class Producto2 implements Comparable<Producto2>{
    private String nombre;
    private Integer precio;
    private int ventas = 0;

    public Producto2(String nombre, int precio) {
        this.nombre=nombre;
        this.precio = precio;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public int getVentas() {
        return ventas;
    }

    public void setVentas(int ventas) {
        this.ventas = ventas;
    }



    @Override
    public int compareTo(Producto2 o) {
        return 0;
    }
}
