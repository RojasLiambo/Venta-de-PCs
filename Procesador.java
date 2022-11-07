
package Modelo;
/*
MicheliLucio
 */
public class Procesador extends Componentes{
    private double potencia;
    
    public Procesador(String mf, double p, String po, double i, double pot){
        super(mf,p,po,i);
        this.potencia = pot;
    }

    @Override
    public double calcularPrecio() {
        double total = super.precio;
        total = total + super.impuesto;
        
        return total;
    }

    @Override
    public String toString() {
       String descripcioncomponente = "-El procesador cuenta con una potencia de "+potencia+"Ghz"+"\n -Su fabricante es "+ super.marcafabricante +"\n -El precio unitario es: " + super.precio + "\n -El país de origen es: "+super.paisorigen+"/n -Los impuestos de este componente son" + super.impuesto + "---TOTAL PRECIO DEL COMPONENTE:" + calcularPrecio()+"---";
       return descripcioncomponente;
    }
    
}
