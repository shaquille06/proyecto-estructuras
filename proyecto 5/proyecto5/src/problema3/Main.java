package problema3;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<String> corredores = new ArrayList<>();

        System.out.println("==================================");
        System.out.println("  REGISTRO DE LLEGADA DE CORREDORES");
        System.out.println("==================================");
        System.out.println("Escriba 'fin' para terminar.\n");

        while (true) {
            System.out.print("Nombre del corredor: ");
            String nombre = entrada.nextLine().trim();

            if (nombre.equalsIgnoreCase("fin")) {
                break;
            }

            if (nombre.isEmpty()) {
                System.out.println("Error: el nombre no puede estar vacio.");
            } else {
                corredores.add(nombre);
                System.out.println("Corredor registrado correctamente.");
            }
        }

        System.out.println("\n==================================");
        System.out.println("       RESULTADOS DE LA CARRERA");
        System.out.println("==================================");

        if (corredores.isEmpty()) {
            System.out.println("No se registraron corredores.");
        } else {
            String[] lista = corredores.toArray(new String[0]);
            LLegada.mostrarCorredores(lista);
        }
    }
}
