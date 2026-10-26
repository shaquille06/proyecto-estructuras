package Laboratorio3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese una palabra de hasta 8 letras: ");

        String palabra = entrada.nextLine().trim();

        // validacion de la entrada para que la palabra no sobrepase las 8 letras
        if (palabra.isEmpty() || palabra.length() > 8) {
            System.out.println("Error: ingrese una palabra de 1 a 8 letras.");
        } else {
            PilaPalabras pila = new PilaPalabras();
        // Salida si no hay errores
            System.out.println("\nPalabra original: " + palabra);
            String invertida = pila.invertirPalabra(palabra);
            if (!invertida.isEmpty()) {
                System.out.println("\nPalabra invertida: " + invertida);
            }
        }
    }
}
