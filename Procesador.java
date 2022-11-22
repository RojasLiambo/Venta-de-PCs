package Modelo;
/*
Mármol, Sofía
 */
public class Procesador extends Componentes{
    
    private String potencia;
    
    public Procesador(int ns, String mf, String nc, double p, double imp, String pot){
        super(ns, mf, nc, p, imp);
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
       String descripcioncomponente = "-El procesador cuenta con una potencia de "+potencia+"Ghz."+"\n -Su fabricante es "+ super.marcafabricante +"\n -El precio unitario es: " + super.precio + "\n -El país de origen es: "+super.paisorigen+"/n -Los impuestos de este componente son" + super.impuesto + "\n ---TOTAL PRECIO DEL COMPONENTE:" + calcularPrecio()+"---";
       return descripcioncomponente;
    }
    
}
