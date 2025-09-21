public class VehicleManagementSystem {
    public static void main(String[] args) {
        ElectricVehicle electric = new ElectricVehicle(120, "Tesla Model 3");
        PetrolVehicle petrol = new PetrolVehicle(150, "Honda Civic");
        
        electric.displayDetails();
        electric.charge();
        petrol.displayDetails();
        petrol.refuel();
    }
}

interface Refuelable {
    void refuel();
}

class Vehicle {
    protected int maxSpeed;
    protected String model;
    
    public Vehicle(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }
    
    public void displayDetails() {
        System.out.println("Model: " + model + ", Max Speed: " + maxSpeed + " km/h");
    }
}

class ElectricVehicle extends Vehicle {
    public ElectricVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }
    
    public void charge() {
        System.out.println(model + " is charging.");
    }
}

class PetrolVehicle extends Vehicle implements Refuelable {
    public PetrolVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }
    
    @Override
    public void refuel() {
        System.out.println(model + " is refueling with petrol.");
    }
}
