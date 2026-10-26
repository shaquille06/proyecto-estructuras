package Laboratorio4;

public class Reserva {

    // Datos de la reserva.
    private String nombreCliente;
    private String tipoHabitacion;
    private String fechaLlegada;

    // Constructor: crea una reserva con sus datos.
    public Reserva(String nombre, String tipo, String fecha) {
        nombreCliente = nombre;
        tipoHabitacion = tipo;
        fechaLlegada = fecha;
    }

    // Devuelve el nombre del cliente.
    public String obtenerNombreCliente() {
        return nombreCliente;
    }

    // Devuelve el tipo de habitacion.
    public String obtenerTipoHabitacion() {
        return tipoHabitacion;
    }

    // Devuelve la fecha de llegada.
    public String obtenerFechaLlegada() {
        return fechaLlegada;
    }

    // Convierte los datos de la reserva en texto.
    @Override
    public String toString() {
        return nombreCliente + " - " + tipoHabitacion
                + " - " + fechaLlegada;
    }
}
