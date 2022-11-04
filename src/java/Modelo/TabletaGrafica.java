/*
Mármol, Sofía Luz
 */
package Modelo;

public class TabletaGrafica extends Componentes{
    
    private boolean tienePantalla;
    
    public TabletaGrafica(String mf, double p, String po, double i, boolean tp){
        super(mf,p,po,i);
        this.tienePantalla = tp;
    }

    @Override
    public double calcularPrecio() {
        double total = super.precio;
        total = total + super.impuesto;
        return total;
    }

    @Override
    public String toString() {
       String variablePantalla = "";
       if(tienePantalla == true){
           variablePantalla = "Tiene pantalla";
       }else{
           variablePantalla = "No tiene pantalla";
       }       
       String descripcioncomponente = "-¿Tiene pantalla? "+variablePantalla+"."+"\n -Su fabricante es "+ super.marcafabricante +"\n -El precio unitario es: " + super.precio + "\n -El país de origen es: "+super.paisorigen+"/n -Los impuestos de este componente son" + super.impuesto + "\n ---TOTAL PRECIO DEL COMPONENTE:" + calcularPrecio()+"---";
       return descripcioncomponente;
    }
    
    @Override
    public String getMarcafabricante() {
        return this.marcafabricante;
    }

    @Override
    public void setMarcafabricante(String marcafabricante) {
        this.marcafabricante = marcafabricante;
    }

    @Override
    public double getPrecio() {
        return this.precio;
    }

    @Override
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String getPaisorigen() {
        return this.paisorigen;
    }

    @Override
    public void setPaisorigen(String paisorigen) {
       this.paisorigen = paisorigen;
    }

    @Override
    public double getImpuesto() {
        return this.impuesto;
    }

    @Override
    public void setImpuesto(double impuesto) {
        this.impuesto = impuesto;
    }
}
