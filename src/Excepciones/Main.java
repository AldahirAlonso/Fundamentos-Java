package Excepciones;

public class Main {

    public static void recursive() {
        recursive();
    }

    public static void main(String[] args) {
        try {
            int result = 10/0; // El resultado se mostrara siempre y cuando no este dividio por cero.
            System.out.println("Resultado " + result);
        } catch (ArithmeticException e) {
            System.out.println("Division por cero.");
        } finally {
            System.out.println("Este mensaje se ejecuta siempre.");
        }

        System.out.println("El programa finaliza.");
    }
}