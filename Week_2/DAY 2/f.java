public class f {
    String customerName;
    String carModel;
    int rentalDays;
    double costPerDay = 1000.0;
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
    void displayRental() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: " + calculateTotalCost());
    }
    public static void main(String[] args) {
        CarRental rental1 = new CarRental("John Doe", "Hyundai Creta", 5);
        rental1.displayRental();
    }
}