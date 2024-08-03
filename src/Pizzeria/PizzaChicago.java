package Pizzeria;

public class PizzaChicago extends Pizza {
    private String grosorMasa;

    public PizzaChicago() {
        this.nombre = "Pizza Chicago";
        this.grosorMasa = "Gruesa";
    }

    @Override
    public void preparar() {
        System.out.println("Preparando pizza estilo Chicago...");
    }

    public String getGrosorMasa() { return grosorMasa; }
    public void setGrosorMasa(String grosorMasa) { this.grosorMasa = grosorMasa; }

    @Override
    public String toString() {
        return super.toString() + ", Grosor de Masa: " + grosorMasa;
    }
}
