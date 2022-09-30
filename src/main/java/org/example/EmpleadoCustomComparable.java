package org.example;


public class EmpleadoCustomComparable extends Empleado implements PersonaCustomComparable {


    public EmpleadoCustomComparable(String nombre, int fecha_nacimiento) {
        super(nombre, fecha_nacimiento);
    }

    public boolean esMayor(EmpleadoCustomComparable otro) {
    }

    @Override
    public boolean esMayor(PersonaCustomComparable otro) {
        return fnacimiento > otro.getFnacimiento();
    }
}
