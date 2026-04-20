package Fundamentos.Bucles;

public class For_While {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i+=2) {
            System.out.println("Valor: " + i);
        }
        System.out.println("Fin del conteo.");

        int counter = 0;
        int acumulador = 0;
        while (counter < 5) {
            System.out.println("Counter: " + counter);
            counter++;
            acumulador = acumulador + counter;
        }

        System.out.println("Acumulador: " + acumulador);

        int counter2 = 0;
        do {
            System.out.println("Counter2: " + counter2);
            counter2++;
        }while (counter2 < 5);
    }
}