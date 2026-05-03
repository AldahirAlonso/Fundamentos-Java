package POO.Vehicle;

public class Motorcycle extends Vehicle {
    private Boolean hasSidecar;

    public Motorcycle(String brand, String model, int year, Boolean hasSidecar) {
        super(brand, model, year);
        this.hasSidecar = hasSidecar;
    }

    public void popWheelie() {
        System.out.println("La moto esta haciendo willy");
    }

    @Override
    public void start() {
        System.out.println("La moto esta encendida");
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "hasSidecar=" + hasSidecar +
                '}' + super.toString(); // Llamando al toString de la otra clase Vehicle.
    }
}
