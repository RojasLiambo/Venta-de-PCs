/**
 *
 * @author Micheli Lucio
 */

package Modelo;

import java.util.ArrayList;
public class Armada extends Computadora{
    private ArrayList<Componentes> listacomp = new ArrayList();

    public Armada(int nc, String po, ArrayList<Componentes> lc) {
        super(nc, po);
        this.listacomp = lc;   }

    @Override
    public double TotalComputadora() {
        double total = 0;
        for (int i = 0; i < this.listacomp.size(); i++) {
           total += this.listacomp.get(i).totalComponentes(); 
        }
        return total;
    }
    
    @Override
    public double calcularImpuestos(){
        double impuestosComponentes = 0;
        for (int i = 0; i < this.listacomp.size(); i++) {
            impuestosComponentes += this.listacomp.get(i).getImpuesto();
        }
        return impuestosComponentes;
    }
    
    public ArrayList<String>nombreComponentes(){
        ArrayList<String> nombreComponentes = new ArrayList();
        for (int i = 0; i < this.listacomp.size(); i++) {
            nombreComponentes.add(this.listacomp.get(i).getNombreComponente());
        }
        
        return nombreComponentes;
    }
    
    @Override
    public String DescripcionComputadora() {
        String Descripcion;
        Descripcion = "Los componentes de la computadora Armada son "+ nombreComponentes() + "\n Cuesta "+ TotalComputadora()+ "$" + " que contienen " + calcularImpuestos()+" de Impuestos";
        return Descripcion;
    }

    public ArrayList<Componentes> getListacomp() {
        return listacomp;
    }

    public void setListacomp(ArrayList<Componentes> listacomp) {
        this.listacomp = listacomp;
    }

    public int getNumeroComputadora() {
        return numeroComputadora;
    }

    public void setNumeroComputadora(int numeroComputadora) {
        this.numeroComputadora = numeroComputadora;
    }

    public String getPaisorigen() {
        return paisorigen;
    }

    public void setPaisorigen(String paisorigen) {
        this.paisorigen = paisorigen;
    }
    
}
