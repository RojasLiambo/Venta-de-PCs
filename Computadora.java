
package Modelo;

public abstract class Computadora {
    protected int numeroComputadora;
    protected String paisorigen;
    
    public Computadora(int nc, String po){
        this.numeroComputadora = nc;
        this.paisorigen = po;
    }
    public abstract double TotalComputadora();
    public abstract double calcularImpuestos();
    public abstract String DescripcionComputadora();

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
