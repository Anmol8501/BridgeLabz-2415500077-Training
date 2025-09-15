class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double costPerDay = 500.0;

    CarRental() {
        customerName = "";
        carModel = "";
        rentalDays = 0;
    }

    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    double calculateTotalCost() {
        return rentalDays * costPerDay;
    }
}
