public class VehicleTransportSystem {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
            new Car(200, "Petrol", 5),
            new Truck(150, "Diesel", 10000),
            new Motorcycle(180, "Petrol", true)
        };
        
        for (Vehicle vehicle : vehicles) {
            vehicle.displayInfo();
            System.out.println();
        }
    }
}

class Vehicle {
    protected int maxSpeed;
    protected String fuelType;
    
    public Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }
    
    public void displayInfo() {
        System.out.println("Max Speed: " + maxSpeed + " km/h, Fuel Type: " + fuelType);
    }
}

class Car extends Vehicle {
    private int seatCapacity;
    
    public Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Car, Seat Capacity: " + seatCapacity);
    }
}

class Truck extends Vehicle {
    private int cargoCapacity;
    
    public Truck(int maxSpeed, String fuelType, int cargoCapacity) {
        super(maxSpeed, fuelType);
        this.cargoCapacity = cargoCapacity;
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Truck, Cargo Capacity: " + cargoCapacity + " kg");
    }
}

class Motorcycle extends Vehicle {
    private boolean hasSidecar;
    
    public Motorcycle(int maxSpeed, String fuelType, boolean hasSidecar) {
        super(maxSpeed, fuelType);
        this.hasSidecar = hasSidecar;
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Motorcycle, Has Sidecar: " + hasSidecar);
    }
}
