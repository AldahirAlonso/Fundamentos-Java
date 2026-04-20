package Fundamentos.Condicionales;

public class If_Switch {
    public static void main(String[] args) {
        int age = 10;

        if(age > 18) {
            System.out.println("Es mayor a 18.");
        } else if(age <= 0) {
            System.out.println("No es valido.");
        } else {
            System.out.println("Es menor a 18.");
        }

        int day = 3;

        switch(day) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            default:
                System.out.println("Dato ingresado no valido.");
        }
    }
}
