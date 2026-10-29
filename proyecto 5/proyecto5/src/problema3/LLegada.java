package problema3;
public class LLegada {

    public static void recursivo(String[] corredores, int j) {
        if (j < corredores.length) {
            System.out.println((j + 1) + ". " + corredores[j]);
            recursivo(corredores, j + 1);
        }
    }

    public static void mostrarCorredores (String[] corredores) {
        recursivo(corredores, 0);
    }
}
