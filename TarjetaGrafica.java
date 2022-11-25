/*
Mármol, Sofía Luz
 */
package Modelo;

public class TarjetaGrafica extends Componentes{
    
    private String tamañomemoria;
    
    public TarjetaGrafica(int ns, String mf, String nc, double p, double imp, String tm){
        super(ns, mf, nc, p, imp );
        this.tamañomemoria = tm;
    }

    
    @Override
    public String toString() {
       String descripcioncomponente = "-La memoria de la tarjeta es de "+tamañomemoria+"GB."+"\n -Su fabricante es "+ super.marcafabricante +"\n -El precio unitario es: " + super.precio + "\n -El país de origen es: "+super.paisorigen+"/n -Los impuestos de este componente son" + super.impuesto + "\n ---TOTAL PRECIO DEL COMPONENTE:" + calcularPrecio()+"---";
       return descripcioncomponente;
    }
    
    @Override
    public double totalComponentes() {
        double total = super.precio;
        total = total + super.impuesto;
        return total;
    
    }

    public String getTamañomemoria() {
        return tamañomemoria;
    }

    public void setTamañomemoria(String tamañomemoria) {
        this.tamañomemoria = tamañomemoria;
    }

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
