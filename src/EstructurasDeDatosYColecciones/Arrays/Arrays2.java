package EstructurasDeDatosYColecciones.Arrays;

public class Arrays2 {
    public static void main(String[] args) {
        int[] numbersPrimitive = {1, 2, 3, 4, 5, 6, 0, 9};

        int deletePosition = 2;

        for (int i = deletePosition; i < numbersPrimitive.length-1; i++) {
            numbersPrimitive[i] = numbersPrimitive[i+1];
        }

        numbersPrimitive[numbersPrimitive.length-1] = 0;

        numbersPrimitive[0] = 200;

        for (int number: numbersPrimitive) {
            System.out.println(number);
        }
    }
}
