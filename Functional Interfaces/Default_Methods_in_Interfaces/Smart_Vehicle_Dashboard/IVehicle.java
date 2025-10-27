package Default_Methods_in_Interfaces.Smart_Vehicle_Dashboard;

public interface IVehicle {
    void displaySpeed(int speed);

    default void displayBattery(int percentage) {
        System.out.println("Battery info not available for this vehicle.");
    }
}
