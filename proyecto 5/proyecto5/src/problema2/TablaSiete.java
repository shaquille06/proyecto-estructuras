package problema2;
public class TablaSiete {
    static void recursivo(int[] a, int j) {
        if (j > -1) {
            recursivo(a, j - 1);
            System.out.println(a[j]);
        }
    }
    public static void mostrarTabla() {
        int[] tabla = new int[10];

        for (int i = 0; i < tabla.length; i++) {
            tabla[i] = 7 * (i + 1);
        }
        recursivo(tabla, tabla.length - 1);
    }
}