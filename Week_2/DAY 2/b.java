class b {
    double radius
    Circle() {
        this(1.0)
    }
    Circle(double radius) {
        this.radius = radius
    }
    double calculateArea() {
        return 3.14159 * radius * radius
    }
    void display() {
        System.out.println("Radius: " + radius)
        System.out.println("Area: " + calculateArea())
    }
}
public class Main {
    public static void main(String[] args) {
        Circle defaultCircle = new Circle()
        Circle customCircle = new Circle(5.5)
        System.out.println("Default Circle:")
        defaultCircle.display()
        System.out.println()
        System.out.println("Custom Circle:")
        customCircle.display()
    }
}