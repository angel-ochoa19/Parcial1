import Pizzeria.*;
public class Main {
    public static void main(String[] args) {
        Sucursal sucursalNY = new Sucursal("Pizzería Nueva York", "123 Calle Principal, NY");

        Empleado empleado1 = new Empleado("Jorge el Curioso", "Cocinero", 3000);
        Empleado empleado2 = new Empleado("Oso Ted", "Cajero", 2500);

        sucursalNY.agregarEmpleado(empleado1);
        sucursalNY.agregarEmpleado(empleado2);

        Masa masa = new Masa("Delgada", 5);
        Salsa salsa = new Salsa("Tomate", 3);
        Queso queso = new Queso("Mozzarella", 2);

        sucursalNY.agregarIngrediente(masa);
        sucursalNY.agregarIngrediente(salsa);
        sucursalNY.agregarIngrediente(queso);

        Equipo horno = new Equipo("Horno", "Operativo");
        Equipo refrigerador = new Equipo("Refrigerador", "Operativo");

        sucursalNY.agregarEquipo(horno);
        sucursalNY.agregarEquipo(refrigerador);

        PizzaNuevaYork pizzaNY = new PizzaNuevaYork();
        pizzaNY.setNombre("Pizza NY Tradicional");
        pizzaNY.setTamaño("Grande");
        pizzaNY.setPrecio(15.99);
        pizzaNY.setEstiloCorte("Triangular");

        PizzaChicago pizzaChicago = new PizzaChicago();
        pizzaChicago.setNombre("Pizza Chicago Especial");
        pizzaChicago.setTamaño("Mediana");
        pizzaChicago.setPrecio(18.99);
        pizzaChicago.setGrosorMasa("Gruesa");

        sucursalNY.agregarEspecialidad(pizzaNY);
        sucursalNY.agregarEspecialidad(pizzaChicago);

        empleado1.trabajar();
        empleado2.tomarOrden();

        pizzaNY.preparar();
        pizzaNY.hornear();
        pizzaNY.cortar();
        pizzaNY.empacar();

        pizzaChicago.preparar();
        pizzaChicago.hornear();
        pizzaChicago.cortar();
        pizzaChicago.empacar();

        System.out.println(sucursalNY);
        for (Empleado emp : sucursalNY.getEmpleados()) {
            System.out.println(emp);
        }
        for (Ingrediente ing : sucursalNY.getIngredientes()) {
            System.out.println("Ingrediente [Nombre: " + ing.obtenerNombre() + ", Cantidad: " + ing.obtenerCantidad() + "]");
        }
        for (Equipo eq : sucursalNY.getEquipos()) {
            System.out.println(eq);
        }
        for (Pizza pizza : sucursalNY.getEspecialidades()) {
            System.out.println(pizza);
        }
    }
}
