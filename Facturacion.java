
package Hijasdecomputadora;

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
            total += Computadora.TotalComputadora();
        }
        return total;
    }
    public ArrayList<String> totalInfoPc(){
        ArrayList<String> infopcs = new ArrayList();
        for (int i = 0; i < this.listapc.size(); i++) {
            infopcs.add(Computadora.DescripcionComputadora());
        }
        return infopcs;
    }
    public double totalImpuesto(){
        double totali=0;
        for (int i = 0; i < this.listapc.size(); i++) {
            totali += Computadora.calcularImpuestos();
        }
        return totali;
    }
    public String emitirTicket(){
        String Ticket;
        Ticket = "Cliente: " +cliente +"/n Empleado que lo atendio: "+empleado+"/n Informacion Computadora/s: " +totalInfoPc()+ "/n Total de impuestos dentro del precio: "+totalImpuesto()+"/n TOTAL A PAGAR: " + TotalComputadoras();
        return Ticket;
    }
}
