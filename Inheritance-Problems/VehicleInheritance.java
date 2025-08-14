class Vehicle {
    void move() {
        System.out.println("Vehicle is moving");
    }
}
public class VehicleInheritance extends Vehicle {
    void move() {
        System.out.println("Car is moving");
    }
    public static void main(String[] args) {
        VehicleInheritance car = new VehicleInheritance();
        car.move();
    }
}
