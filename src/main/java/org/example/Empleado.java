package org.example;

public abstract class Empleado {
    private String nombre;
    protected int fnacimiento;

    public int getFnacimiento() {
        return fnacimiento;
    }


    public Empleado(String nombre, int fecha_nacimiento) {
        this.nombre=nombre;
        this.fnacimiento = fecha_nacimiento;
    }

}
