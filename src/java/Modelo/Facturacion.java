
package Modelo;
/*
 Micheli Lucio
 */
import java.util.ArrayList;

public class Facturacion {
    private Cliente cliente;
    private Empleado empleado;
    private ArrayList<Computadora> listapc = new ArrayList();
    private String metodoCompra;

    public Facturacion(Cliente c, Empleado e,ArrayList<Computadora> lpc, String mc){
        this.cliente = c;
        this.empleado = e;
        this.metodoCompra = mc;
        this.listapc = lpc;
    }

    public double totalComputadora(){
        double total = 0;
        for (int i = 0; i < this.listapc.size(); i++) {
            total += this.listapc.get(i).totalComponentes();
        }
        return total;
    }
    public double aplicarDescuento(){
        double descuento = 0;
        double resta = 0;
        resta = totalComputadora() * 5 / 100;
        descuento = totalComputadora() - resta;
        return descuento;
    }
    public double generarTotalPrecio(){
        double total = 0;
        if (listapc.size() > 1) {
            total = aplicarDescuento();
        }else{
            total = totalComputadora();
        }
        return total;
    }
    public double MostrarImpuesto(){
        double total = 0;
        for (int i = 0; i < this.listapc.size(); i++) {
            total += this.listapc.get(i).totalImpuestos();
        }
        return total;
    }
    
    
    public String toString(){
        String StringFacturaDesc = "";
      if(this.listapc.size()>1){
          StringFacturaDesc = "\"--- Se aplico un descuento del 5% por su compra numero:" +listapc.size();
      }
      String factura = StringFacturaDesc + "\n Los impuestos totales son: "+MostrarImpuesto() +"/n EL TOTAL A PAGAR ES: " + generarTotalPrecio();
      return factura;
    }
}
