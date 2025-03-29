class Device {
    private String deviceId;
    private String status;
    public Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }
    public String getDeviceId() {
        return deviceId;
    }
    public String getStatus() {
        return status;
    }
}
class Thermostat extends Device {
    private double temperatureSetting;
    public Thermostat(String deviceId, String status, double temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }
    public double getTemperatureSetting() {
        return temperatureSetting;
    }
    public void displayStatus() {
        System.out.println("Device ID: " + getDeviceId());
        System.out.println("Status: " + getStatus());
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
    }
}
public class b {
    public static void main(String[] args) {
        Thermostat thermostat = new Thermostat("T1001", "Active", 22.5);
        thermostat.displayStatus();
    }
}