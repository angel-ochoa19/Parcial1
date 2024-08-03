package Pizzeria;

public class Equipo {
    private String tipo;
    private String estado;

    public Equipo(String tipo, String estado) {
        this.tipo = tipo;
        this.estado = estado;
    }

    public void encender() {
        System.out.println("Encendiendo el equipo: " + tipo);
    }

    public void apagar() {
        System.out.println("Apagando el equipo: " + tipo);
    }

    public void reparar() {
        System.out.println("Reparando el equipo: " + tipo);
    }

    // Getters y Setters
    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    @Override
    public String toString() {
        return "Equipo{" +
                "tipo='" + tipo + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }
}
