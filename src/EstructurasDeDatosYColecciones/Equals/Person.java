package EstructurasDeDatosYColecciones.Equals;

import java.util.Objects;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }
    // La funcion de Override indica que este metodo sobreescribe a la funcion equals original.
    @Override
    public boolean equals(Object o) { // Metodo equals de tipo Boolean que va a comparar dos objetos, recibiendo un objeto de tipo Object (o).
        if(this == o) return true; // Verifica si ambos objetos apuntan a la misma referencia en memoria.
        if(o == null || getClass() != o.getClass())return false; // Verifica si el objeto recibido es null o si pertenece a una clase diferente.
        Person person = (Person) o; // // Convierte el objeto 'o' a tipo Person para poder acceder a sus atributos.
        return Objects.equals(name, person.name); // Compara los nombres de ambos objetos Person y devuelve true o false.
    }

    public static void main(String[] args) {
        Person person1 = new Person("Juan");
        Person person2 = new Person("Maria");

        System.out.println(person2.equals(person1)); // Valida si person 2 es igual a person 1.
    }
}