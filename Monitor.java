/*
Mármol, Sofía Luz
 */
package Modelo;

public class Monitor extends Componentes {
    
    private int cantPulgadas;
    
    public Monitor(String mf, double p, String po, double i, int cp){
        super(mf,p,po,i);
        this.cantPulgadas = cp;
    }

    @Override
    public double calcularPrecio() {
        double total = super.precio;
        total = total + super.impuesto;
        return total;
    }

    @Override
    public String toString() {
       String descripcioncomponente = "-El monitor cuenta con "+cantPulgadas+" pulgadas."+"\n -Su fabricante es "+ super.marcafabricante +"\n -El precio unitario es: " + super.precio + "\n -El país de origen es: "+super.paisorigen+"/n -Los impuestos de este componente son" + super.impuesto + "\n ---TOTAL PRECIO DEL COMPONENTE:" + calcularPrecio()+"---";
       return descripcioncomponente;
    }
    
}
