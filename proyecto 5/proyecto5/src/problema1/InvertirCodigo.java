package problema1;

public class InvertirCodigo {

    static void recursivo(int[] a, int j) {
        if (j > -1) {
            recursivo(a, j - 1);
        }
        System.out.println(a[j + 1]);
    }

    public static void mostrarCodigoAlReves(int[] codigo) {
        int[] invertido = new int[codigo.length];

        for (int i = 0; i < codigo.length; i++) {
            invertido[i] = codigo[codigo.length - 1 - i];
        }

        recursivo(invertido, invertido.length - 2);
    }
}