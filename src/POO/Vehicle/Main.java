package POO.Vehicle;

public class Main {
    public static void main(String[] args) {

        /*Vehicle vehicle = new Vehicle("Toyota", "Yaris", 2020);

        vehicle.setYear(2001);

        System.out.println(vehicle.toString());*/

        Car myCar = new Car("Toyota", "Corrlla", 2021, 4);
        Motorcycle motorcycle = new Motorcycle("Honda", "CBR", 2021, false);

        myCar.start();
        motorcycle.start();
    }
}
