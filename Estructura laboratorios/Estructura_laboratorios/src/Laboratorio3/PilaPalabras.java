package Laboratorio3;
public class PilaPalabras {

    // aqui declaramos el arreglo y colocamos su capacidad
    private final char[] pila;
    private final int MAXIMO = 8;
    private int tope;
    // aca se establece la pila vacía
    public PilaPalabras() {
        pila = new char[MAXIMO];
        tope = -1;}

    // Verifica el estado de la pila
    public boolean estaVacia() {return tope == -1;}
    public boolean estaLlena() {return tope == MAXIMO - 1;}

    // inserta una letra
    public boolean push(char letra) {
        if (estaLlena()) {
            System.out.println("Error: desbordamiento, pila llena.");
            return false;
        }
        tope = tope + 1; // 1. Aumenta TOPE.
        pila[tope] = letra; // 2. Guarda la letra.
        System.out.println("Letra insertada: " + letra);
        mostrarEstado();

        return true;
    }

    // extrae la letra que está en el tope.
    public Character pop() {
        if (estaVacia()) {
            System.out.println("Error: subdesbordamiento, pila vacia.");
            mostrarEstado();
            return null;
        }
        char dato = pila[tope]; // 1. Recupera el dato.
        tope = tope - 1;        // 2. Disminuye TOPE.
        System.out.println("Letra extraida: " + dato);
        mostrarEstado();
        return dato;
    }

    // Muestra solamente los elementos válidos.
    public void mostrarEstado() {
        System.out.print("Pila (base -> tope): ");
        if (estaVacia()) {
            System.out.print("[vacia]");
        } else {
            for (int i = 0; i <= tope; i++) {
                System.out.print(pila[i]);

                if (i < tope) {
                    System.out.print(" ");
                }
            }
        }
        System.out.println(" | TOPE = " + tope);
    }

    // Invierte la palabra utilizando PUSH y POP.
    public String invertirPalabra(String palabra) {
        StringBuilder invertida = new StringBuilder();
        System.out.println("\n--- Insertando letras (PUSH) ---");
        for (int i = 0; i < palabra.length(); i++) {
            if (!push(palabra.charAt(i))) {
                return "";
            }
        }
        System.out.println("\n--- Extrayendo letras (POP) ---");
        while (!estaVacia()) {
            Character letra = pop();

            if (letra != null) {
                invertida.append(letra);
            }
        }
        return invertida.toString();
    }
}
