package problema4;

public class Factorial {
    public static int sumar(int[] a, int j) {
        if (j < 0) {
            return 0;
        }

        return a[j] + sumar(a, j - 1);
    }
}
