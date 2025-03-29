import java.util.*;
abstract class Vehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;
    public Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }
    public String getVehicleId() {
        return vehicleId;
    }
    public String getDriverName() {
        return driverName;
    }
    public double getRatePerKm() {
        return ratePerKm;
    }
    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Driver Name: " + driverName);
        System.out.println("Rate per Km: " + ratePerKm);
    }
    public abstract double calculateFare(double distance);
}
interface GPS {
    String getCurrentLocation();
    void updateLocation(String newLocation);
}
class Car extends Vehicle implements GPS {
    private String location;
    public Car(String vehicleId, String driverName, double ratePerKm, String location) {
        super(vehicleId, driverName, ratePerKm);
        this.location = location;
    }
    public double calculateFare(double distance) {
        return distance * getRatePerKm();
    }
    public String getCurrentLocation() {
        return location;
    }
    public void updateLocation(String newLocation) {
        this.location = newLocation;
    }
}
class Bike extends Vehicle implements GPS {
    private String location;
    public Bike(String vehicleId, String driverName, double ratePerKm, String location) {
        super(vehicleId, driverName, ratePerKm);
        this.location = location;
    }
    public double calculateFare(double distance) {
        return distance * getRatePerKm();
    }
    public String getCurrentLocation() {
        return location;
    }
    public void updateLocation(String newLocation) {
        this.location = newLocation;
    }
}
class Auto extends Vehicle implements GPS {
    private String location;
    public Auto(String vehicleId, String driverName, double ratePerKm, String location) {
        super(vehicleId, driverName, ratePerKm);
        this.location = location;
    }
    public double calculateFare(double distance) {
        return distance * getRatePerKm();
    }
    public String getCurrentLocation() {
        return location;
    }
    public void updateLocation(String newLocation) {
        this.location = newLocation;
    }
}
public class h {
    public static void processRides(List<Vehicle> vehicles, double distance) {
        for (Vehicle v : vehicles) {
            v.getVehicleDetails();
            System.out.println("Fare for " + distance + " km: " + v.calculateFare(distance));
            if (v instanceof GPS) {
                System.out.println("Current Location: " + ((GPS) v).getCurrentLocation());
                ((GPS) v).updateLocation("Updated Location");
                System.out.println("New Location: " + ((GPS) v).getCurrentLocation());
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        List<Vehicle> rides = new ArrayList<>();
        rides.add(new Car("C001", "Alice", 15, "Downtown"));
        rides.add(new Bike("B101", "Bob", 10, "Uptown"));
        rides.add(new Auto("A501", "Charlie", 12, "City Center"));

        processRides(rides, 8.5);
    }
}