package Fundamentos.Scanner;

import java.util.Scanner;

public class NumberCompare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int firstNumber = scanner.nextInt();

        System.out.println("Digite otro numero:");
        int secondNumber = scanner.nextInt();

        int sum = firstNumber + secondNumber;
        int rest = firstNumber - secondNumber;

        System.out.println("La suma de a + b = " + sum);
        System.out.println("La resta de a - b = " + rest);

        if (firstNumber>secondNumber) {
            System.out.println("El primer numero es mayor");
        } else {
            System.out.println("El segundo numero es mayor o igual");
        }

        System.out.println("Fin de la aplicacion");

        scanner.close();
    }
}
