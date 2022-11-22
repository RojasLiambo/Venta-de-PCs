/*
Mármol, Sofía Luz
 */
package Modelo;

public class Mouse extends Componentes{
    
    private String cantDPI;
    
    public Mouse(int ns, String mf, String nc, double p, double imp, String dpi){
        super(ns, mf, nc, p, imp);
        this.cantDPI = dpi;
    }

    @Override
    public double calcularPrecio() {
        double total = super.precio;
        total = total + super.impuesto;
        return total;
    }

    @Override
    public String toString() {
       String descripcioncomponente = "-El DPI es de "+cantDPI+"."+"\n -Su fabricante es "+ super.marcafabricante +"\n -El precio unitario es: " + super.precio + "\n -El país de origen es: "+super.paisorigen+"/n -Los impuestos de este componente son" + super.impuesto + "\n ---TOTAL PRECIO DEL COMPONENTE:" + calcularPrecio()+"---";
       return descripcioncomponente;
    }
}
