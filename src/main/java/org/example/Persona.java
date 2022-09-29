package org.example;

import java.time.LocalDate;

public class Persona {
    private String nombre;
    private int fnacimiento;

    public int getFnacimiento() {
        return fnacimiento;
    }


    public Persona(String nombre, int fecha_nacimiento) {
        this.nombre=nombre;
        this.fnacimiento = fecha_nacimiento;
    }


    public boolean esMayor(Persona otro) {
        return fnacimiento > otro.getFnacimiento();
    }
}
