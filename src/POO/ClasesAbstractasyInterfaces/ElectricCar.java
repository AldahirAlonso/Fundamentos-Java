package POO.ClasesAbstractasyInterfaces;

public class ElectricCar extends Vehicle implements Electric, SelfDriving { // Las interfaces permiten herencias multiples, las clases no.
    private int batteryLevel;

    public ElectricCar(String brand, String model, int year, Color color, VehicleStatus vehicleStatus, int batteryLevel) {
        super(brand, model, year, color, vehicleStatus);
        this.batteryLevel = batteryLevel;
    }

    public ElectricCar(String brand, String model, int year, int batteryLevel) {
        super(brand, model, year);
        this.batteryLevel = batteryLevel;
    }

    @Override
    public void drive() {
        System.out.println("El auto esta en marcha");
    }

    @Override
    public void chargeBattery() {
        batteryLevel = MAX_BATTERY_CAPACITY;
        System.out.println("La bateria esta cargada al 100%");
    }

    @Override
    public void activateAutopilot() {
        System.out.println("Modo piloto automatico activado");
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "batteryLevel=" + batteryLevel +
                '}' + super.toString();
    }
}