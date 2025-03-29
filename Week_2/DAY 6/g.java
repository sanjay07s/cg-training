import java.util.*;
abstract class Patient {
    private String patientId;
    private String name;
    private int age;
    public Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }
    public String getPatientId() {
        return patientId;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    public abstract double calculateBill();
}
interface MedicalRecord {
    void addRecord(String record);
    List<String> viewRecords();
}
class InPatient extends Patient implements MedicalRecord {
    private int daysAdmitted;
    private double dailyCharge;
    private List<String> records;
    public InPatient(String patientId, String name, int age, int daysAdmitted, double dailyCharge) {
        super(patientId, name, age);
        this.daysAdmitted = daysAdmitted;
        this.dailyCharge = dailyCharge;
        this.records = new ArrayList<>();
    }
    public double calculateBill() {
        return daysAdmitted * dailyCharge;
    }
    public void addRecord(String record) {
        records.add(record);
    }
    public List<String> viewRecords() {
        return records;
    }
}
class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private List<String> records;
    public OutPatient(String patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
        this.records = new ArrayList<>();
    }
    public double calculateBill() {
        return consultationFee;
    }
    public void addRecord(String record) {
        records.add(record);
    }
    public List<String> viewRecords() {
        return records;
    }
}
public class g {
    public static void main(String[] args) {
        List<Patient> patients = new ArrayList<>();
        InPatient ip = new InPatient("P101", "Alice", 30, 4, 1500);
        ip.addRecord("Admitted for fever.");
        ip.addRecord("Given antibiotics.");
        OutPatient op = new OutPatient("P102", "Bob", 25, 500);
        op.addRecord("Consulted for cold.");
        op.addRecord("Prescribed rest.");
        patients.add(ip);
        patients.add(op);
        for (Patient p : patients) {
            p.getPatientDetails();
            System.out.println("Bill Amount: " + p.calculateBill());
            if (p instanceof MedicalRecord) {
                System.out.println("Medical Records:");
                for (String r : ((MedicalRecord) p).viewRecords()) {
                    System.out.println("- " + r);
                }
            }
            System.out.println();
        }
    }
}