package problema1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String codigo;

        while (true) {
            System.out.print("Ingrese un codigo numerico: ");
            codigo = entrada.nextLine();

            if (codigo.matches("[0-9]+")) {
                break;
            }
            System.out.println("Error: solo puede ingresar numeros, sin letras ni espacios.");
        }
        int[] numeros = new int[codigo.length()];
        for (int i = 0; i < codigo.length(); i++) {
            numeros[i] = Character.getNumericValue(codigo.charAt(i));
        }
        System.out.println("Codigo original: " + codigo);
        System.out.println("Codigo al reves:");

        InvertirCodigo.mostrarCodigoAlReves(numeros);
    }
}