/**
 *
 * @author Micheli Lucio
 */

package Modelo;

import java.util.Date;
import java.util.ArrayList;

public class Facturacion {
    private int NumeroFactura ;
    private Cliente cliente;
    private Date FechaFactu;
    private Empleado empleado;
    private ArrayList<Computadora> listapc = new ArrayList();
    private String metodocompra;
    
    
    public Facturacion(int nf,Cliente c,Empleado e,ArrayList<Computadora> lpc,String mc){
        this.NumeroFactura = nf;
        this.cliente = c;
        this.listapc = lpc;
        this.metodocompra = mc; 
        
    }
    public double TotalComputadoras(){
        double total = 0;
        for (int i = 0; i < this.listapc.size(); i++) {
            total += this.listapc.get(i).TotalComputadora();
        }
        return total;
    }
    public ArrayList<String> totalInfoPc(){
        ArrayList<String> infopcs = new ArrayList();
        for (int i = 0; i < this.listapc.size(); i++) {
            infopcs.add(this.listapc.get(i).DescripcionComputadora());
        }
        return infopcs;
    }
    public double totalImpuesto(){
        double totali=0;
        for (int i = 0; i < this.listapc.size(); i++) {
            totali += this.listapc.get(i).calcularImpuestos();
        }
        return totali;
    }
    public String emitirTicket(){
        String Ticket;
        Ticket = "Fecha: " + this.FechaFactu + "Cliente: " + this.cliente +"/n Empleado que lo atendio: "+ this.empleado+ "/n Metodo de compra"+ this.metodocompra + "/n Informacion Computadora/s: " +totalInfoPc()+ "/n Total de impuestos dentro del precio: "+totalImpuesto()+"/n TOTAL A PAGAR: " + TotalComputadoras();
        return Ticket;
    }
}
