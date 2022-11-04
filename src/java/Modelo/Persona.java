//Nayla
package Modelo;


public abstract class Persona {

protected String nombre;
protected int dni;

public Persona(String nombre, int dni) {
    this.nombre = nombre;
    this.dni = dni;
}

 public abstract String toString();
 

    public abstract String getNombre();

    public abstract void setNombre(String nombre);

    public abstract int getDni();

    public abstract void setDni(int dni);
 
}
