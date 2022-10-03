package org.example.FromScratch;

public class Producto implements ProductoComparable{
    private String nombre;
    private Integer precio;
    private int ventas = 0;

    public Producto(String nombre, int precio) {
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
    public boolean esMayor(ProductoComparable otroProducto) {
        return precio>((Producto)otroProducto).precio;
        //return ventas>((Producto)otroProducto).ventas;
    }

}
