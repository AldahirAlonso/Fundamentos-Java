package Avanzado.Genericos.Object_Generic;

public class Main {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>("Hola Mundo");
        System.out.println("stringBox = " + stringBox.getValue());

        Box<Integer> integerBox = new Box<>(10);
        System.out.println("integerBox = " + integerBox.getValue());
    }
}