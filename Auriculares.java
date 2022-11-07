/*
Mármol, Sofía Luz
 */
package Modelo;

public class Auriculares extends Componentes{
    
    private String tipoA;
    
    public Auriculares(String mf, double p, String po, double i, String ta){
        super(mf,p,po,i);
        this.tipoA = ta;
    }

    @Override
    public double calcularPrecio() {
        double total = super.precio;
        total = total + super.impuesto;
        return total;
    }

    @Override
    public String toString() {
       String descripcioncomponente = "-El tipo de auricular es "+tipoA+"."+"\n -Su fabricante es "+ super.marcafabricante +"\n -El precio unitario es: " + super.precio + "\n -El país de origen es: "+super.paisorigen+"/n -Los impuestos de este componente son" + super.impuesto + "\n ---TOTAL PRECIO DEL COMPONENTE:" + calcularPrecio()+"---";
       return descripcioncomponente;
    }
    
}
