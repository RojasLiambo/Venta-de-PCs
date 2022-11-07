/*
Mármol, Sofía Luz
 */
package Modelo;

public class MemoriaRAM extends Componentes{
    
    private double tamaño;
    
    public MemoriaRAM(String mf, double p, String po, double i, double t){
        super(mf,p,po,i);
        this.tamaño = t;
    }

    @Override
    public double calcularPrecio() {
        double total = super.precio;
        total = total + super.impuesto;
        return total;
    }

    @Override
    public String toString() {
       String descripcioncomponente = "-La memoria cuenta con un espacio de "+tamaño+"GB."+"\n -Su fabricante es "+ super.marcafabricante +"\n -El precio unitario es: " + super.precio + "\n -El país de origen es: "+super.paisorigen+"/n -Los impuestos de este componente son" + super.impuesto + "\n ---TOTAL PRECIO DEL COMPONENTE:" + calcularPrecio()+"---";
       return descripcioncomponente;
    }
    
    
}
