package Clases_Objetos.ScannerExample;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = getNumber(scanner, "Ingresa el primer numero");

        int second = getNumber(scanner, "Ingresa el segundo numero");

        printArithmeticOperations(first, second);

        compareNumber(first, second);
    }

    public static int getNumber(Scanner scanner, String message) {
        System.out.println(message);
        int number = scanner.nextInt();
        return number;
    }

    public static void printArithmeticOperations(int firstNumber, int secondNumber) {
        System.out.println("La suma de a + b es: " + (firstNumber + secondNumber));
        System.out.println("La resta de a - b es: " + (firstNumber - secondNumber));
    }

    public static void compareNumber(int first, int second) {
        if (first > second) {
            System.out.println("El primer numero es mayor");
        } else {
            System.out.println("El segundo numero es mayor o igual");
        }
    }
}