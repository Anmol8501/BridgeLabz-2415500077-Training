package Default_Methods_in_Interfaces.Smart_Vehicle_Dashboard;

public class ElectricCarImpl implements IVehicle {
    public void displaySpeed(int speed) {
        System.out.println("Electric car speed: " + speed + " km/h");
    }

    @Override
    public void displayBattery(int percentage) {
        System.out.println("Battery level: " + percentage + "%");
    }

}
