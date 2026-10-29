import java.util.Scanner;
public class MenuPrincipal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion = -1;
        do {
            System.out.println("\n================================");
            System.out.println("       MENU PRINCIPAL");
            System.out.println("================================");
            System.out.println("1. Problema 1: imprimir despues de recursar");
            System.out.println("2. Problema 2: imprimir al retornar");
            System.out.println("3. Problema 3: imprimir antes de recursar");
            System.out.println("4. Problema 4: sumar arreglo recursivamente");
            System.out.println("0. Salir");
            System.out.println("================================");
            System.out.print("Seleccione una opcion: ");

            if (!entrada.hasNextInt()) {
                System.out.println("Error: debe ingresar una opcion numerica.");
                entrada.nextLine();
                continue;
            }

            opcion = entrada.nextInt();
            entrada.nextLine();

            switch (opcion) {
                case 1:
                    problema1.Main.main(new String[0]);
                    break;

                case 2:
                    problema2.Main.main(new String[0]);
                    break;

                case 3:
                    problema3.Main.main(new String[0]);
                    break;

                case 4:
                    problema4.Main.main(new String[0]);
                    break;

                case 0:
                    System.out.println("Gracias por utilizar el programa.");
                    break;

                default:
                    System.out.println("Opcion no valida. Intente nuevamente.");
            }

        } while (opcion != 0);
        entrada.close();
    }
}
