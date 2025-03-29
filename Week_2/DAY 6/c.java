import java.util.*;
abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;
    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }
    public String getVehicleNumber() {
        return vehicleNumber;
    }
    public String getType() {
        return type;
    }
    public double getRentalRate() {
        return rentalRate;
    }
    public void setRentalRate(double rentalRate) {
        this.rentalRate = rentalRate;
    }
    public abstract double calculateRentalCost(int days);
}
interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}
class Car extends Vehicle implements Insurable {
    private String insurancePolicy;
    public Car(String vehicleNumber, double rentalRate, String insurancePolicy) {
        super(vehicleNumber, "Car", rentalRate);
        this.insurancePolicy = insurancePolicy;
    }
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }
    public double calculateInsurance() {
        return getRentalRate() * 0.15;
    }
    public String getInsuranceDetails() {
        return "Car Insurance Policy: " + insurancePolicy;
    }
}
class Bike extends Vehicle implements Insurable {
    private String insurancePolicy;
    public Bike(String vehicleNumber, double rentalRate, String insurancePolicy) {
        super(vehicleNumber, "Bike", rentalRate);
        this.insurancePolicy = insurancePolicy;
    }
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }
    public double calculateInsurance() {
        return getRentalRate() * 0.05;
    }
    public String getInsuranceDetails() {
        return "Bike Insurance Policy: " + insurancePolicy;
    }
}
class Truck extends Vehicle implements Insurable {
    private String insurancePolicy;
    public Truck(String vehicleNumber, double rentalRate, String insurancePolicy) {
        super(vehicleNumber, "Truck", rentalRate);
        this.insurancePolicy = insurancePolicy;
    }
    public double calculateRentalCost(int days) {
        return (getRentalRate() * days) + 500;
    }
    public double calculateInsurance() {
        return getRentalRate() * 0.2;
    }
    public String getInsuranceDetails() {
        return "Truck Insurance Policy: " + insurancePolicy;
    }
}
public class c {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("KA01AB1234", 1500, "CARINS123"));
        vehicles.add(new Bike("KA02XY5678", 500, "BIKEINS456"));
        vehicles.add(new Truck("KA03PQ9101", 2500, "TRUCKINS789"));
        int days = 5;
        for (Vehicle v : vehicles) {
            double rental = v.calculateRentalCost(days);
            double insurance = 0;
            System.out.println("Vehicle Type: " + v.getType());
            System.out.println("Vehicle Number: " + v.getVehicleNumber());
            System.out.println("Rental for " + days + " days: " + rental);
            if (v instanceof Insurable) {
                insurance = ((Insurable) v).calculateInsurance();
                System.out.println("Insurance: " + insurance);
                System.out.println(((Insurable) v).getInsuranceDetails());
            }
            System.out.println("Total Cost: " + (rental + insurance));
            System.out.println();
        }
    }
}