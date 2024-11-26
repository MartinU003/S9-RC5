import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear un hotel
        Hotel hotel = new Hotel("Hotel Estrella");

        // Agregar habitaciones al hotel
        Habitacion habitacion1 = new Habitacion(101, "Simple", 50.0);
        Habitacion habitacion2 = new Habitacion(102, "Doble", 80.0);
        Habitacion habitacion3 = new Habitacion(103, "Suite", 150.0);

        hotel.agregarHabitacion(habitacion1);
        hotel.agregarHabitacion(habitacion2);
        hotel.agregarHabitacion(habitacion3);


        System.out.println("Habitaciones disponibles antes de la reserva:");
        for (Habitacion habitacion : hotel.consultarDisponibilidad()) {
            System.out.println("Habitación " + habitacion.getNumero() + " - Tipo: " + habitacion.getTipo());
        }


        System.out.println("\nCreando una reserva...");
        Reserva reserva = new Reserva("Juan Pérez", habitacion1, "01/12/2024", "03/12/2024");


        System.out.println("\nReserva creada:");
        System.out.println(reserva);


        System.out.println("\nHabitaciones disponibles después de la reserva:");
        for (Habitacion habitacion : hotel.consultarDisponibilidad()) {
            System.out.println("Habitación " + habitacion.getNumero() + " - Tipo: " + habitacion.getTipo());
        }
    }
}