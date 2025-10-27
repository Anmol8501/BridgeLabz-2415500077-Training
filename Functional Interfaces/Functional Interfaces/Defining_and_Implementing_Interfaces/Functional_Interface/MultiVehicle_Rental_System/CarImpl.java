package Functional_Interface.MultiVehicle_Rental_System;

public class CarImpl implements IVehicleRental {
    @Override
    public void rent() {
        System.out.println("Car has been rented.");
    }
    @Override
    public void returnVehicle() {
        System.out.println("Car has been returned.");
    }
}
