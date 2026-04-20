package Fundamentos.Bucles;

public class For {
    public static void main(String[] args) {

        final int MAX_COUNT = 5;
        for(int currentName = 0; currentName <= MAX_COUNT; currentName+=2) {
            System.out.println("Valor: " + currentName);
        }
    }
}
