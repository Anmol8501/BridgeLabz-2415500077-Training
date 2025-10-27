package Default_Methods_in_Interfaces.Smart_Vehicle_Dashboard;

public class Main {
    public static void main(String[] args) {
        IVehicle car = new CarImpl();
        car.displaySpeed(80);
        car.displayBattery(0); 

        IVehicle tesla = new ElectricCarImpl();
        tesla.displaySpeed(100);
        tesla.displayBattery(85); 
    }
}
