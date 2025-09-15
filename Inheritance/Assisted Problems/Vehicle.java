class Vehicle {
    int maxSpeed;
    String fuelType;

    Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    void displayInfo() {
        System.out.println("Max Speed: " + maxSpeed + ", Fuel Type: " + fuelType);
    }
}

class Car extends Vehicle {
    int seatCapacity;

    Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    void displayInfo() {
        System.out.println("Car - Max Speed: " + maxSpeed + ", Fuel Type: " + fuelType + ", Seats: " + seatCapacity);
    }
}

class Truck extends Vehicle {
    double loadCapacity;

    Truck(int maxSpeed, String fuelType, double loadCapacity) {
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }

    void displayInfo() {
        System.out.println("Truck - Max Speed: " + maxSpeed + ", Fuel Type: " + fuelType + ", Load: " + loadCapacity + " tons");
    }
}

class Motorcycle extends Vehicle {
    String type;

    Motorcycle(int maxSpeed, String fuelType, String type) {
        super(maxSpeed, fuelType);
        this.type = type;
    }

    void displayInfo() {
        System.out.println("Motorcycle - Max Speed: " + maxSpeed + ", Fuel Type: " + fuelType + ", Type: " + type);
    }
}

// Polymorphism demonstration
class VehicleArrayDemo {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new Car(180, "Petrol", 5);
        vehicles[1] = new Truck(120, "Diesel", 10.5);
        vehicles[2] = new Motorcycle(150, "Petrol", "Sport");
        for (Vehicle v : vehicles) {
            v.displayInfo();
        }
    }
}
