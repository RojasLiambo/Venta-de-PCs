package Modelo;

/*
Mármol, Sofía Luz
 */

public class MemoriaRAM extends Componentes{
    
    private String tamaño;
    
    public MemoriaRAM(int ns, String mf, String nc, double p, double imp, String t){
        super(ns, mf, nc, p, imp);
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
