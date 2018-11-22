import java.util.Vector;

/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {
//        System.out.println(new App().getGreeting());
        Vehicle vehicleA = new Vehicle("AE86", "Toyota");
        Vehicle vehicleB = new Vehicle("GT-R", "NISSAN");
        vehicleA.speedUp(50);
        vehicleB.speedUp(100);

        Car car = new Car("A new car", "Yamaha");
        car.speedUp(180);
        car.speedUp(250);

        Vehicle bus = new Bus("Flying Bus", "Unknown Brand");
        bus.speedUp(80);
        bus.speedUp(2147483647);

        Driver gtrDriver = new Driver("GT-R Driver", vehicleB);
        gtrDriver.speedUp(100);
        gtrDriver.speedUp(2147483647);

        Driver busDriver = new Driver("Bus Driver", bus);
        busDriver.speedUp(80);
        busDriver.speedUp(81);

        Driver carDriver = new Driver("Car Driver", car);
        carDriver.speedUp(180);
        carDriver.speedUp(250);
    }
}

class Driver {
    private String name;
    private Vehicle vehicle;

    public Driver(String name, Vehicle vehicle) {
        this.name = name;
        this.vehicle = vehicle;
    }

    public void speedUp(int speed){
        System.out.println(String.format("%s is trying to speed his/her vehicle up...", this.name));
        this.vehicle.speedUp(speed);
    }
}

class Vehicle {
    private String name;
    private String brand;

    public Vehicle(String name, String brand){
        this.name = name;
        this.brand = brand;
    }

    public void speedUp(int speed){
        System.out.println(String.format("A car with name: %s, brand: %s has speed up to %d!!!!!!!!!!!", this.name, this.brand, speed));
    }
}

class Car extends Vehicle {
    private String name;
    private String brand;

    public Car(String name, String brand){
        super(name, brand);
    }

    @Override
    public void speedUp(int speed){
        if (speed <= 200) {
            super.speedUp(speed);
        } else {
            System.out.println("Speed exist limitation! This car failed to speed up!");
        }
    }
}

class Bus extends Vehicle {
    private String name;
    private String brand;

    public Bus(String name, String brand){
        super(name, brand);
    }

    @Override
    public void speedUp(int speed){
        if (speed <= 80) {
            super.speedUp(speed);
        } else {
            System.out.println("Speed exist limitation! This bus failed to speed up!");
        }
    }
}