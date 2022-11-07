/*
Mármol, Sofía Luz
 */
package Modelo;

public class Fuente extends Componentes{
    
    private int potenciaWtts;
    
    public Fuente(String mf, double p, String po, double i, int pw){
        super(mf,p,po,i);
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
