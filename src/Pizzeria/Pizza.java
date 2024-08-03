package Pizzeria;

public abstract class Pizza {
    protected String nombre;
    protected String tamaño;
    protected double precio;

    public abstract void preparar();

    public void hornear() {
        System.out.println("Horneando la pizza...");
    }

    public void cortar() {
        System.out.println("Cortando la pizza...");
    }

    public void empacar() {
        System.out.println("Empacando la pizza...");
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getTamaño() { return tamaño; }
    public void setTamaño(String tamaño) { this.tamaño = tamaño; }

    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }

    @Override
    public String toString() {
        return "Pizza [Nombre: " + nombre + ", Tamaño: " + tamaño + ", Precio: $" + precio + "]";
    }
}


