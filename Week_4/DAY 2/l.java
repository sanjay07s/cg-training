import java.util.*;
public class l {
    public static void main(String[] args) {
        PriorityQueue<Patient> pq = new PriorityQueue<>((a, b) -> b.severity - a.severity);
        pq.add(new Patient("John", 3));
        pq.add(new Patient("Alice", 5));
        pq.add(new Patient("Bob", 2));
        System.out.println("Patients in order of treatment:");
        while (!pq.isEmpty()) {
            Patient patient = pq.poll(); 
            System.out.println(patient.name);
        }
    }
    static class Patient {
        String name;
        int severity;
        Patient(String name, int severity) {
            this.name = name;
            this.severity = severity;
        }
    }
}