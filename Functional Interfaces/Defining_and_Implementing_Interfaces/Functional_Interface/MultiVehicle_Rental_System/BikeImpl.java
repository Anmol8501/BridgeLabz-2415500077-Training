package Functional_Interface.MultiVehicle_Rental_System;

public class BikeImpl implements IVehicleRental {
    @Override
    public void rent() {
        System.out.println("Bike has been rented.");
    }
    @Override
    public void returnVehicle() {
        System.out.println("Bike has been returned.");
    }
    
}
