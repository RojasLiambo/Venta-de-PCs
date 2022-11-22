/*
Mármol, Sofía Luz
 */
package Modelo;

public class Mother extends Componentes{
    
    private String NumSerie;
    
    public Mother(String mf, String nc, double p, double imp, String ns){
        super(ns, mf, nc, p, imp);
        this.NumSerie = ns;
    }

    @Override
    public double calcularPrecio() {
        double total = super.precio;
        total = total + super.impuesto;
        return total;
    }

    @Override
    public String toString() {
       String descripcioncomponente = "-El número de serie de la MotherBoard es "+NumSerie+"."+"\n -Su fabricante es "+ super.marcafabricante +"\n -El precio unitario es: " + super.precio + "\n -El país de origen es: "+super.paisorigen+"/n -Los impuestos de este componente son" + super.impuesto + "\n ---TOTAL PRECIO DEL COMPONENTE:" + calcularPrecio()+"---";
       return descripcioncomponente;
    }
    
    
    
}
