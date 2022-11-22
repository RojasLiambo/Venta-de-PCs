/*
Mármol, Sofía Luz
 */
package Modelo;

public class Monitor extends Componentes {
    
    private String cantPulgadas;
    
    public Monitor(int ns, String mf, String nc, double p, double imp, String cp){
        super(ns, mf, nc, p, imp);
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
