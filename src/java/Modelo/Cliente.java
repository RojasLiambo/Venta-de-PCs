//Nayla
package Modelo;

import Modelo.Persona;

public class Cliente extends Persona{
private String correo;

public Cliente(String correo, String nombre, int dni) {
super(nombre, dni);
    this.correo = correo;
}

public String toString(){
    return Persona.class.toString()+ "\n Correo: "+this.correo ;
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
