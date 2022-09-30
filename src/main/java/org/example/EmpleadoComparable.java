package org.example;


public class EmpleadoComparable extends Empleado implements Comparable<EmpleadoComparable>{

    public EmpleadoComparable(String nombre, int fecha_nacimiento) {
        super(nombre, fecha_nacimiento);
    }

    @Override
    public int compareTo(EmpleadoComparable otro) {
        return Integer.compare(fnacimiento, otro.fnacimiento);
    }

}
