import java.util.*;
class Employee {
    String name;
    Department department;
    public Employee(String name, Department department) {
        this.name = name;
        this.department = department;
    }
    public String getName() {
        return name;
    }
    public Department getDepartment() {
        return department;
    }
        public String toString() {
        return name;
    }
}
enum Department {
    HR, IT, SALES, MARKETING
}
public class r {
    public static void main(String[] args) {
       List<Employee> employees = Arrays.asList(
                new Employee("Alice", Department.HR),
                new Employee("Bob", Department.IT),
                new Employee("Carol", Department.HR),
                new Employee("David", Department.SALES),
                new Employee("Eve", Department.IT)
        );
        Map<Department, List<Employee>> groupedByDepartment = groupByDepartment(employees);
        groupedByDepartment.forEach((department, employeeList) -> {
            System.out.println(department + ": " + employeeList);
        });
    }
    public static Map<Department, List<Employee>> groupByDepartment(List<Employee> employees) {
        Map<Department, List<Employee>> departmentMap = new HashMap<>();
        for (Employee employee : employees) {
            departmentMap
                .computeIfAbsent(employee.getDepartment(), k -> new ArrayList<>())
                .add(employee);
        }
        return departmentMap;
    }
}