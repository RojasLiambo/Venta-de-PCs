/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;
public class HP extends Computadora{
    private ArrayList<Componentes> listacomp = new ArrayList();

    public HP(int nc, String po, ArrayList<Componentes> lc) {
        super(nc, po);
        this.listacomp = lc;
    }

    @Override
    public double TotalComputadora() {
        double total = 0;
        for (int i = 0; i < this.listacomp.size(); i++) {
           total += Componentes.totalComponentes(); 
        }
        return total;
    }
    
    @Override
    public double calcularImpuestos(){
        double impuestosComponentes = 0;
        for (int i = 0; i < this.listacomp.size(); i++) {
            impuestosComponentes += Componentes.getimpuesto();
        }
    }
    
    public ArrayList<String>nombreComponentes(){
        ArrayList<String> nombreComponentes = new ArrayList();
        for (int i = 0; i < this.listacomp.size(); i++) {
            nombreComponentes.add(Componentes.getnombreComponente());
        }
        
        return nombreComponentes;
    }
    
    @Override
    public String DescripcionComputadora() {
        String Descripcion;
        Descripcion = "Los componentes de la computadora HP son "+ nombreComponentes() + " Cuesta "+ TotalComputadora()+ "$" + " que contienen " + calcularImpuestos()+" de Impuestos";
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
