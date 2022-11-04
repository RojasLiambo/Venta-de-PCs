/*
Mármol, Sofía Luz
 */
package Modelo;

public class WebCam extends Componentes{
    
    private String resolucion;
    
    public WebCam(String mf, double p, String po, double i, String r){
        super(mf,p,po,i);
        this.resolucion = r;
    }

    @Override
    public double calcularPrecio() {
        double total = super.precio;
        total = total + super.impuesto;
        return total;
    }

    @Override
    public String toString() {
       String descripcioncomponente = "-La cámara tiene una resolución de "+resolucion+" px."+"\n -Su fabricante es "+ super.marcafabricante +"\n -El precio unitario es: " + super.precio + "\n -El país de origen es: "+super.paisorigen+"/n -Los impuestos de este componente son" + super.impuesto + "\n ---TOTAL PRECIO DEL COMPONENTE:" + calcularPrecio()+"---";
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
