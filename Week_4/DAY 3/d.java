import java.io.*;
import java.util.ArrayList;
import java.util.List;
class Employee implements Serializable {
    private int id;
    private String name;
    private String department;
    private double salary;
    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Dept: " + department + ", Salary: ₹" + salary;
    }
}
public class d {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "Alice", "HR", 50000));
        employees.add(new Employee(102, "Bob", "IT", 75000));
        employees.add(new Employee(103, "Charlie", "Finance", 60000));
        String filename = "employees.ser";
        serializeEmployees(employees, filename);
        deserializeEmployees(filename);
    }
    public static void serializeEmployees(List<Employee> list, String file) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(list);
            System.out.println("Employees serialized successfully.\n");
        } catch (IOException e) {
            System.out.println("Serialization error: " + e.getMessage());
        }
    }
    public static void deserializeEmployees(String file) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            List<Employee> list = (List<Employee>) ois.readObject();
            System.out.println("Deserialized Employee Data:");
            for (Employee emp : list) {
                System.out.println(emp);
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Deserialization error: " + e.getMessage());
        }
    }
}