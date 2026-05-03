package POO.Vehicle;

public class Main {
    public static void main(String[] args) {

        /*Vehicle vehicle = new Vehicle("Toyota", "Yaris", 2020);

        vehicle.setYear(2001);

        System.out.println(vehicle.toString());*/

        Vehicle myCar = new Car("Toyota", "Corrlla", 2021, 4);
        Vehicle motorcycle = new Motorcycle("Honda", "CBR", 2021, false);

        myCar.start();
        motorcycle.start();

        printVehicle(motorcycle);
        printVehicle(myCar);

        ((Car)myCar).setDoors(5);

        printVehicle(myCar);
    }

    public static void printVehicle(Vehicle vehicle) {
        System.out.println(vehicle.toString());
    }
}
