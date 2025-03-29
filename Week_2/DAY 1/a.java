import java.util.Scanner;
class a {
    String name
    int rollNumber
    int marks
    Student(String name, int rollNumber, int marks) {
        this.name = name
        this.rollNumber = rollNumber
        this.marks = marks
    }
    String calculateGrade() {
        if (marks >= 90) return "A"
        else if (marks >= 80) return "B"
        else if (marks >= 70) return "C"
        else if (marks >= 60) return "D"
        else return "F"
    }
    void displayDetails() {
        System.out.println("Name: " + name)
        System.out.println("Roll Number: " + rollNumber)
        System.out.println("Marks: " + marks)
        System.out.println("Grade: " + calculateGrade())
    }
}
public class StudentReport {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in)
        System.out.print("Enter name: ")
        String name = scanner.nextLine()
        System.out.print("Enter roll number: ")
        int rollNumber = scanner.nextInt()
        System.out.print("Enter marks: ")
        int marks = scanner.nextInt()
        Student student = new Student(name, rollNumber, marks)
        student.displayDetails()
    }
}