/*
 Micheli Lucio
 */
package Modelo;

public abstract class Componentes {
    
    protected String marcafabricante;
    protected double precio;
    protected String paisorigen;
    protected double impuesto;
    
    public Componentes(String mf, double p, String po, double i){
        this.marcafabricante = mf;
        this.precio = p;
        this.paisorigen = po;
        this.impuesto = i;
    }
    
    public abstract double calcularPrecio();
    
    public abstract String toString();
    
}
