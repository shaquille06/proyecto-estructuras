
import java.util.Scanner;

public class MenuPrincipal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n===== SISTEMA PRINCIPAL =====");
            System.out.println("1. Laboratorio 3 - Invertir palabras");
            System.out.println("2. Laboratorio 4 - Reservas del hotel");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opcion: ");

            while (!entrada.hasNextInt()) {
                System.out.println("Debe ingresar un numero.");
                entrada.nextLine();
                System.out.print("Seleccione una opcion: ");
            }

            opcion = entrada.nextInt();
            entrada.nextLine();

            switch (opcion) {
                case 1:
                    Laboratorio3.Main.main(new String[0]);
                    break;

                case 2:
                    Laboratorio4.Main.main(new String[0]);
                    break;

                case 3:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opcion no valida.");
            }

        } while (opcion != 3);

        entrada.close();
    }
}
