package problema4;

public class Factorial {

    public static int recursivo(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        return n * recursivo(n - 1);
    }

    public static int calcularFactorialDeSiete() {
        return recursivo(7);
    }
}
