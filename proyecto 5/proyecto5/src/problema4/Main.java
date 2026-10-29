package problema4;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese un numero entero entre 0 y 20: ");

        if (!entrada.hasNextInt()) {
            System.out.println("Error: debe ingresar un numero entero.");
            entrada.close();
            return;
        }
        int numero = entrada.nextInt();
        if (numero < 0 || numero > 20) {
            System.out.println("Error: ingrese un numero entre 0 y 20.");
            entrada.close();
            return;
        }
        long resultado = Factorial.recursivo(numero);
        System.out.println("El factorial de " + numero + " es: " + resultado);

    }
}
