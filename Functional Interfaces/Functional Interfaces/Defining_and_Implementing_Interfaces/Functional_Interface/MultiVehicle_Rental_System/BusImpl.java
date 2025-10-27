package Functional_Interface.MultiVehicle_Rental_System;

public class BusImpl implements IVehicleRental {
    @Override
    public void rent() {
        System.out.println("Bus has been rented.");
    }
    @Override
    public void returnVehicle() {
        System.out.println("Bus has been returned.");
    }
    
}
