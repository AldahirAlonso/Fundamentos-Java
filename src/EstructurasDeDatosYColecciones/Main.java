package EstructurasDeDatosYColecciones;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3};

        System.out.println(numbers[0]);

        numbers[0] = 100;

        System.out.println(numbers[0]);

        int[] fixedArray = new int[100];

        System.out.println("Dimension: " + fixedArray.length);

        List<Integer> numbers2 = new ArrayList<>();

        numbers2.add(1);
        numbers2.add(10);
        numbers2.add(100);

        System.out.println("numbers2 = " + numbers2);
    }
}
