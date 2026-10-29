package problema4;

public class Main {
    public static void main(String[] args) {
        int[] a = {9, 8, 7, 6, 5};

        System.out.println("PROBLEMA 4");
        System.out.println("Suma recursiva de a = {9, 8, 7, 6, 5}");
        System.out.println("Resultado: " + Factorial.sumar(a, a.length - 1));
    }
}
