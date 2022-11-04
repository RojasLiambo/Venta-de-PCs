// Nayla
package Modelo;

import java.time.LocalTime;

public class Empleado extends Persona{
private LocalTime horario;

public Empleado(LocalTime horario, String nombre, int dni) {
    super(nombre, dni);
    this.horario = horario;
}

public String toString(){
    return Persona.class.toString()+ "\n Horario: "+ this.horario;
}

    @Override
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int getDni() {
        return this.dni;
    }

    @Override
    public void setDni(int dni) {
        this.dni = dni;
    }

}
