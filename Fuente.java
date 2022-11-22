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
    public double calcularPrecio() {
        double total = super.precio;
        total = total + super.impuesto;
        return total;
    } 

    @Override
    public String toString() {
       String descripcioncomponente = "-La fuente tiene una potencia de "+potenciaWtts+"W."+"\n -Su fabricante es "+ super.marcafabricante +"\n -El precio unitario es: " + super.precio + "\n -El país de origen es: "+super.paisorigen+"/n -Los impuestos de este componente son" + super.impuesto + "\n ---TOTAL PRECIO DEL COMPONENTE:" + calcularPrecio()+"---";
       return descripcioncomponente;
    }
    
}
