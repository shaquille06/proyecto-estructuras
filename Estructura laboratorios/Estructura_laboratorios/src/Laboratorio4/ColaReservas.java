package Laboratorio4;
public class ColaReservas {

    // Declaracion del arreglo y su capacidad
    private final Reserva[] cola;
    private final int MAXIMO = 8;

    // FRENTE será posicion de la primera reserva pendiente.
    // FINAL será posicion de la ultima reserva almacenada.
    private int frente;
    private int fin;

    public ColaReservas() {
        cola = new Reserva[MAXIMO];
        // La cola comienza vacia.
        frente = -1;
        fin = -1;
    }

    // Verifica si la cola esta vacia.
    public boolean estaVacia() {
        return frente == -1 && fin == -1;
    }
    // Verifica si FINAL llego al ultimo indice del arreglo.
    public boolean estaLlena() {
        return fin == MAXIMO - 1;
    }

    // ENCOLAR: agrega una reserva al final de la cola lineal.
    public void encolar(Reserva reserva) {
        if (estaLlena()) {
            System.out.println("Error: no se puede registrar la reserva.");
            System.out.println("FINAL llego al ultimo indice del arreglo.");
            // La cola no se modifica.
            mostrarEstado();
            return;}
        if (estaVacia()) {
            // Primera reserva de la cola.
            frente = 0;
            fin = 0;
        } else {
            // Primero se incrementa FINAL.
            fin = fin + 1;
        }

        // Despues se almacena la reserva.
        cola[fin] = reserva;

        System.out.println("Reserva registrada correctamente.");
        mostrarEstado();
    }

    // DESENCOLAR: elimina la reserva que esta en FRENTE.
    public Reserva desencolar() {

        if (estaVacia()) {
            System.out.println("Error: no hay reservas para atender.");
            mostrarEstado();
            return null;
        }

        // Primero se recupera la reserva.
        Reserva reserva = cola[frente];

        // Se libera la posicion que se acaba de atender.
        cola[frente] = null;

        System.out.println("Reserva extraida de la cola:");
        System.out.println(reserva);

        if (frente == fin) {
            // Era la ultima reserva: la cola queda vacia.
            frente = -1;
            fin = -1;
        } else {
            // Se avanza FRENTE sin desplazar elementos.
            frente = frente + 1;
        }

        mostrarEstado();
        return reserva;
    }

    // Consulta la primera reserva sin eliminarla.
    public Reserva consultarFrente() {
        if (estaVacia()) {
            return null;
        }
        return cola[frente];
    }

    // Muestra las reservas que siguen pendientes.
    public void mostrarReservas() {
        if (estaVacia()) {
            System.out.println("No hay reservas pendientes.");
            mostrarEstado();
            return;}

        System.out.println("\nReservas pendientes:");
        // Para reccorer las posisiones valdiad
        for (int i = frente; i <= fin; i++) {
            System.out.println((i + 1) + ". " + cola[i]);
        }
        mostrarEstado();
    }

    // esto muestra los elementos validos y los dos punteros.
    public void mostrarEstado() {
        System.out.print("Cola (FRENTE -> FINAL): ");
        if (estaVacia()) {
            System.out.print("[vacia]");
        } else {
            for (int i = frente; i <= fin; i++) {
                if (cola[i] != null) {
                    System.out.print("[" + cola[i] + "] ");
                }
            }
        }
        System.out.println();
        System.out.println("FRENTE = " + frente);
        System.out.println("FINAL = " + fin);
    }
}