package Functional_Interface.MultiVehicle_Rental_System;

public class Main {
    public static void main(String[] args) {
        IVehicleRental car = new CarImpl();
        IVehicleRental bike = new BikeImpl();
        IVehicleRental bus = new BusImpl();

        car.rent();
        bike.rent();
        bus.rent();

        car.returnVehicle();
        bike.returnVehicle();
        bus.returnVehicle();

    }
}
