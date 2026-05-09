package EstructurasDeDatosYColecciones.LinkedList;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> cities = new LinkedList<>();
        cities.add("Buenos Aires");
        cities.add("Paris");
        cities.add("New York");

        // Elementos añadidos al principio de la lista gracias al metodo addFirst.
        ((LinkedList<String>)cities).addFirst("london");
        ((LinkedList<String>)cities).addLast("Berflin");
        System.out.println(cities.get(2));

        System.out.println(cities);

        System.out.println(cities.set(2, "Madrid")); // Metodo para agregar elemento.
        System.out.println(cities.remove("Paris")); // Metodo para eliminar un elemento.

        ((LinkedList<String>)cities).removeFirst(); // Elimina el primer elemento.
        ((LinkedList<String>)cities).removeLast(); // Elimina el ultimo elementi.

        String searchCity = "Buenos Aires";

        if (cities.contains(searchCity)) {
            System.out.println("Esta en la lista");
        } else {
            System.out.println("No esta en la lista");
        }

        for (String city: cities) {
            System.out.println("- " + city);
        }
    }
}