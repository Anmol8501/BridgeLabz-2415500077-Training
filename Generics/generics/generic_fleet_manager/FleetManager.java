package generic_fleet_manager;

import java.util.*;

class Vehicle { public String toString() { return "Vehicle"; } }
class Truck extends Vehicle { public String toString() { return "Truck"; } }
class Bike extends Vehicle { public String toString() { return "Bike"; } }

class FleetManager<T extends Vehicle> {
    private List<T> fleet = new ArrayList<>();
    public void addVehicle(T vehicle) { fleet.add(vehicle); }
    public void showFleet() { fleet.forEach(System.out::println); }

    public static void main(String[] args) {
        FleetManager<Truck> trucks = new FleetManager<>();
        trucks.addVehicle(new Truck());
        trucks.showFleet();

        FleetManager<Bike> bikes = new FleetManager<>();
        bikes.addVehicle(new Bike());
        bikes.showFleet();
    }
}