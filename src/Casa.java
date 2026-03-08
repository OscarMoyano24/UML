public class Casa {

    Habitacion habitacion1;
    Habitacion habitacion2;

    public Casa() {

        habitacion1 = new Habitacion("Sala");
        habitacion2 = new Habitacion("Dormitorio");

    }

    public void mostrarHabitaciones() {
        System.out.println("Habitaciones de la casa:");
        System.out.println(habitacion1.nombre);
        System.out.println(habitacion2.nombre);
    }

}