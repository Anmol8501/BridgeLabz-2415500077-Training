package Default_Methods_in_Interfaces.Smart_Vehicle_Dashboard;

public class CarImpl implements IVehicle {
    public void displaySpeed(int speed) {
        System.out.println("Car speed: " + speed + " km/h");
    }
}
