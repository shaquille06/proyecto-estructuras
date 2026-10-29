package problema3;

public class LLegada {
    public static void recursivo(int[] a, int j) {
        if (j > -1) {
            System.out.println(a[j]);
            recursivo(a, j - 1);
        }
    }
}
