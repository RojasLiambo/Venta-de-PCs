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
    public double calcularPrecio() {
        double total = super.precio;
        total = total + super.impuesto;
        return total;
    }

    @Override
    public String toString() {
       String descripcioncomponente = "-La memoria de la tarjeta es de "+tamañomemoria+"GB."+"\n -Su fabricante es "+ super.marcafabricante +"\n -El precio unitario es: " + super.precio + "\n -El país de origen es: "+super.paisorigen+"/n -Los impuestos de este componente son" + super.impuesto + "\n ---TOTAL PRECIO DEL COMPONENTE:" + calcularPrecio()+"---";
       return descripcioncomponente;
    }
    
}
