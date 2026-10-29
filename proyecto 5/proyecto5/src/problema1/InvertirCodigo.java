package problema1;

public class InvertirCodigo {

    public static void recursivo(int[] a, int j) {
        if (j > -1) {
            recursivo(a, j - 1);
        }
        System.out.println(a[j + 1]);
    }
}