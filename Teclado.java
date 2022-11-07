/*
Mármol, Sofía Luz
 */
package Modelo;

public class Teclado extends Componentes{
    
    private String tipo;
    
    public Teclado(String mf, double p, String po, double i, String t){
        super(mf,p,po,i);
        this.tipo = t;
    }

    @Override
    public double calcularPrecio() {
        double total = super.precio;
        total = total + super.impuesto;
        return total;
    }

    @Override
    public String toString() {
       String descripcioncomponente = "-El tipo de teclado es "+tipo+"."+"\n -Su fabricante es "+ super.marcafabricante +"\n -El precio unitario es: " + super.precio + "\n -El país de origen es: "+super.paisorigen+"/n -Los impuestos de este componente son" + super.impuesto + "\n ---TOTAL PRECIO DEL COMPONENTE:" + calcularPrecio()+"---";
       return descripcioncomponente;
    }
    
    
}
