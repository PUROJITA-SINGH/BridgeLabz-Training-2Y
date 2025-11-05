import java.util.*;

class Vehicle { String name; Vehicle(String n){ name=n; } public String toString(){ return name; } }
class Truck extends Vehicle { Truck(){ super("Truck"); } }
class Bike extends Vehicle { Bike(){ super("Bike"); } }

class FleetManager<T extends Vehicle> {
    private List<T> fleet = new ArrayList<>();
    public void addVehicle(T v){ fleet.add(v); }
    public void showFleet(){ System.out.println(fleet); }
}

public class FleetManagerDemo {
    public static void main(String[] args) {
        FleetManager<Truck> trucks = new FleetManager<>();
        trucks.addVehicle(new Truck());
        trucks.showFleet();

        FleetManager<Bike> bikes = new FleetManager<>();
        bikes.addVehicle(new Bike());
        bikes.showFleet();
    }
}
