
package Modelo;
/*
 Micheli Lucio
 */
import java.util.ArrayList;
public class Computadora {
    private ArrayList<Componentes> listaComponentes = new ArrayList();
    private String descripcion;
 
    public Computadora(ArrayList<Componentes> lc, String d){
        this.descripcion = d;
        this.listaComponentes = lc;
        
    }
    public double totalComponentes(){
        double total = 0;
        for (int i = 0; i < this.listaComponentes.size(); i++) {
            total = this.listaComponentes.get(i).calcularPrecio();

        }
        return total;
    }
    public double totalImpuestos(){
        double impuesto = 0;
        for (int i = 0; i < this.listaComponentes.size(); i++) {
            impuesto += this.listaComponentes.get(i).getImpuesto();

        }
        return impuesto;
    }
    public String toString(){
        String datos = "La descripcion de la computadora es: " + descripcion + "el precio total de los componentes es: " +totalComponentes() + "los impuestos de esta computadora son "+ totalImpuestos();
        return datos;
    }

    public ArrayList<Componentes> getListaComponentes() {
        return listaComponentes;
    }

    public void setListaComponentes(ArrayList<Componentes> listaComponentes) {
        this.listaComponentes = listaComponentes;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
