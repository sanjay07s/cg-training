class c {
    String name
    int age
    Person(String name, int age) {
        this.name = name
        this.age = age
    }
    Person(Person other) {
        this.name = other.name
        this.age = other.age
    }
    void display() {
        System.out.println("Name: " + name)
        System.out.println("Age: " + age)
    }
}
public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Alice", 30)
        Person p2 = new Person(p1)
        System.out.println("Original Person:")
        p1.display()
        System.out.println()
        System.out.println("Copied Person:")
        p2.display()
    }
}