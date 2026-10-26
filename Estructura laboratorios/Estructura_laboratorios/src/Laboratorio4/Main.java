package Laboratorio4;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ColaReservas cola = new ColaReservas();
        int opcion;

        do {
            System.out.println("\n=== SISTEMA DE RESERVAS DEL HOTEL ===");
            System.out.println("1. Registrar reserva");
            System.out.println("2. Atender siguiente reserva");
            System.out.println("3. Consultar proxima reserva");
            System.out.println("4. Mostrar reservas pendientes");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opcion: ");

            // verifica que la opcion ingresada sea un numero.
            while (!entrada.hasNextInt()) {
                System.out.println("Error: debe ingresar un numero.");
                entrada.nextLine();
                System.out.print("Seleccione una opcion: ");
            }

            opcion = entrada.nextInt();
            entrada.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Nombre del cliente: ");
                    String nombre = entrada.nextLine();

                    System.out.print("Tipo de habitacion: ");
                    String tipo = entrada.nextLine();

                    System.out.print("Fecha de llegada (DD/MM/AAAA): ");
                    String fecha = entrada.nextLine();

                    Reserva nueva = new Reserva(nombre, tipo, fecha);
                    cola.encolar(nueva);
                    break;

                case 2:
                    Reserva atendida = cola.desencolar();

                    if (atendida == null) {
                        System.out.println(
                                "No hay reservas para atender.");
                    } else {
                        System.out.println("Reserva atendida:");
                        System.out.println(atendida);
                    }
                    break;

                case 3:
                    Reserva siguiente = cola.consultarFrente();

                    if (siguiente == null) {
                        System.out.println(
                                "No hay reservas pendientes.");
                    } else {
                        System.out.println("Proxima reserva:");
                        System.out.println(siguiente);
                    }
                    break;

                case 4:
                    cola.mostrarReservas();
                    break;

                case 5:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opcion no valida.");
            }
        } while (opcion != 5);
    }
}
