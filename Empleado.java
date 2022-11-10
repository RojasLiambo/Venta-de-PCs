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
    return Persona.class.toString()+ "\n Horario: "+ this.ho;
}

}
