import java.io.*;
class Student {
    private int rollNumber;
    private String name;
    private double gpa;
    public Student(int rollNumber, String name, double gpa) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.gpa = gpa;
    }
    public int getRollNumber() {
        return rollNumber;
    }
    public String getName() {
        return name;
    }
    public double getGpa() {
        return gpa;
    }
}
public class g {
    public static void main(String[] args) {
        String fileName = "student_details.dat";
        Student student = new Student(101, "Alice", 3.85);
        storeStudentDetails(fileName, student);
        retrieveStudentDetails(fileName);
    }
    public static void storeStudentDetails(String fileName, Student student) {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName))) {
            dos.writeInt(student.getRollNumber());
            dos.writeUTF(student.getName());
            dos.writeDouble(student.getGpa());
            System.out.println("Student details stored successfully.");
        } catch (IOException e) {
            System.out.println("Error while storing student details: " + e.getMessage());
        }
    }
    public static void retrieveStudentDetails(String fileName) {
        try (DataInputStream dis = new DataInputStream(new FileInputStream(fileName))) {
            int rollNumber = dis.readInt();
            String name = dis.readUTF();
            double gpa = dis.readDouble();
            System.out.println("Retrieved Student Details:");
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Name: " + name);
            System.out.println("GPA: " + gpa);
        } catch (IOException e) {
            System.out.println("Error while retrieving student details: " + e.getMessage());
        }
    }
}