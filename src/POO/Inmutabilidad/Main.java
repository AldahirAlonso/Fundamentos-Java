package POO.Inmutabilidad;

public class Main {
    public static void main(String[] args) {
        House house = new House(2, 4, 1);
        System.out.println("house.getDoors() = " + house.getDoors());
    }
}
