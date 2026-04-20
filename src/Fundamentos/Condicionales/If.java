package Fundamentos.Condicionales;

public class If {
    public static void main(String[] args) {
        int age = 19;
        double average = 7.5;

        boolean isAdult = age > 17;
        boolean hasPassingGrade = average >= 7;

        if(isAdult && hasPassingGrade) {
            System.out.println("El estudiante cumple con todos los requisitos.");
        }

        if(!isAdult) {
            System.out.println("Es adulto.");
        }
    }
}
