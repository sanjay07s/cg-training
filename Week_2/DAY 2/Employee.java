class Employee {
    public int employeeID;
    protected String department;
    private double salary;
    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }
}
class Manager extends Employee {
    String team;
    public Manager(int employeeID, String department, double salary, String team) {
        super(employeeID, department, salary);
        this.team = team;
    }
    public void displayManagerDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Team: " + team);
    }
    public static void main(String[] args) {
        Manager manager = new Manager(101, "HR", 75000.0, "Recruitment");
        manager.displayEmployeeDetails();
        manager.displayManagerDetails();
        manager.setSalary(80000.0);
        System.out.println("Updated Salary: " + manager.getSalary());
    }
}