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

    public abstract String getMarcafabricante();


    public abstract void setMarcafabricante(String marcafabricante);

    public abstract double getPrecio();

    public abstract void setPrecio(double precio);

    public abstract String getPaisorigen();

    public abstract void setPaisorigen(String paisorigen);

    public abstract double getImpuesto();

    public abstract void setImpuesto(double impuesto);
    
}
