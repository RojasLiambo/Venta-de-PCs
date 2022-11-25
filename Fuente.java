/*
Mármol, Sofía Luz
 */
package Modelo;

public class Fuente extends Componentes{
    
    private String potenciaWtts;
    
    public Fuente(int ns, String mf, String nc, double p, double imp, String pw){
        super(ns, mf, nc, p, imp);
        this.potenciaWtts = pw;
    }

    @Override
    public String toString() {
       String descripcioncomponente = "-La fuente tiene una potencia de "+potenciaWtts+"W."+"\n -Su fabricante es "+ super.marcafabricante +"\n -El precio unitario es: " + super.precio + "\n -El país de origen es: "+super.paisorigen+"/n -Los impuestos de este componente son" + super.impuesto + "\n ---TOTAL PRECIO DEL COMPONENTE:" + calcularPrecio()+"---";
       return descripcioncomponente;
    }

    @Override
    public double totalComponentes() {
        double total = super.precio;
        total = total + super.impuesto;
        return total;
    
    }
    

    public String getPotenciaWtts() {
        return potenciaWtts;
    }

    public void setPotenciaWtts(String potenciaWtts) {
        this.potenciaWtts = potenciaWtts;
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
