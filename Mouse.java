/*
Mármol, Sofía Luz
 */
package Modelo;

public class Mouse extends Componentes{
    
    private int cantDPI;
    
    public Mouse(String mf, double p, String po, double i, int dpi){
        super(mf,p,po,i);
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
