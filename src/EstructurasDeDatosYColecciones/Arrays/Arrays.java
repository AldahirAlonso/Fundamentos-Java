package EstructurasDeDatosYColecciones.Arrays;

public class Arrays {
    public static void main(String[] args) {
        int[] numbersPrimitive = new int[5];
        numbersPrimitive[0]=10;
        numbersPrimitive[1]=20;

        int[] newNumbers = new int [numbersPrimitive.length + 1];
        System.arraycopy(numbersPrimitive, 0, newNumbers, 0, numbersPrimitive.length);
        newNumbers[5]=500;

        Integer[] numbersWrapper = new Integer[5];
        numbersWrapper[0] = 10;
        numbersWrapper[1] = 20;

        System.out.println("Arreglo con dato Primitivo.");
        for (int number: newNumbers) { // Tipo Primitivo
            System.out.println(number);
        }

        System.out.println("Arreglo con Wrapper.");
        for (Integer number: numbersWrapper) { // Tipo Wrapper - Integer
            System.out.println(number);
        }
    }
}