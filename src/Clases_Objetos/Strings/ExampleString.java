package Clases_Objetos.Strings;

public class ExampleString {
    public static void main(String[] args) {
        String name = "Aldahir";
        String name2 = "Gabriel";

        System.out.println(name==name2); // Pool String

        String name3 = new String("Gabriel"); // No tiene Pool String

        System.out.println(name3);

        System.out.println(name.toUpperCase());

        System.out.println(name);

        Person person1 = new Person("Aldahir", "Alonso");

        System.out.println(person1.toString());
    }
}