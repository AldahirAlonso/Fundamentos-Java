package Clases_Objetos.BlockStatic;

public class BlockExample {

    public static void main(String[] args) {
        System.out.println("Hola Mundo...");
    }

    // El bloque estatico se va a ejecutar primero a pesar de estar abajo.
    static {
        System.out.println("Bloque estático ejecutando...");
    }
}
