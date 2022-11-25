/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hijasdecomputadora;

/**
 *
 * @author Lucio
 */
public abstract class Componentes {
    protected int numerodeserie;
    protected String marcafabricante;
    protected String nombreComponente;
    protected double precio;
    protected double impuesto;
    
    public Componentes(int ns, String mf,String nc,double p,double i){
        this.numerodeserie= ns;
        this.marcafabricante = mf;
        this.nombreComponente = nc;
        this.precio = p;
        this.impuesto = i;
           
                
    }
    
    public abstract double totalComponentes();
    
    public abstract String toString();

    public int getNumerodeserie() {
        return numerodeserie;
    }

    public void setNumerodeserie(int numerodeserie) {
        this.numerodeserie = numerodeserie;
    }

    public String getMarcafabricante() {
        return marcafabricante;
    }

    public void setMarcafabricante(String marcafabricante) {
        this.marcafabricante = marcafabricante;
    }

    public String getNombreComponente() {
        return nombreComponente;
    }

    public void setNombreComponente(String nombreComponente) {
        this.nombreComponente = nombreComponente;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(double impuesto) {
        this.impuesto = impuesto;
    }
            
}
