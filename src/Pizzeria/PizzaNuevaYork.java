package Pizzeria;

public class PizzaNuevaYork extends Pizza {
    private String estiloCorte;

    public PizzaNuevaYork() {
        this.nombre = "Pizza Nueva York";
        this.estiloCorte = "Triangular";
    }

    @Override
    public void preparar() {
        System.out.println("Preparando pizza estilo Nueva York...");
    }

    public String getEstiloCorte() { return estiloCorte; }
    public void setEstiloCorte(String estiloCorte) { this.estiloCorte = estiloCorte; }

    @Override
    public String toString() {
        return super.toString() + ", Estilo de Corte: " + estiloCorte;
    }
}