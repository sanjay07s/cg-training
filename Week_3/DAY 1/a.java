import java.util.Scanner;
class Student {
    int rollNo;
    String name;
    int age;
    String grade;
    Student next;
    public Student(int rollNo, String name, int age, String grade) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}
class StudentLinkedList {
    private Student head;
    public void addAtBeginning(int rollNo, String name, int age, String grade) {
        Student newStudent = new Student(rollNo, name, age, grade);
        newStudent.next = head;
        head = newStudent;
    }
    public void addAtEnd(int rollNo, String name, int age, String grade) {
        Student newStudent = new Student(rollNo, name, age, grade);
        if (head == null) {
            head = newStudent;
            return;
        }
        Student temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newStudent;
    }
    public void addAtPosition(int pos, int rollNo, String name, int age, String grade) {
        if (pos == 1) {
            addAtBeginning(rollNo, name, age, grade);
            return;
        }
        Student newStudent = new Student(rollNo, name, age, grade);
        Student temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null) return;
        newStudent.next = temp.next;
        temp.next = newStudent;
    }
    public void deleteByRollNumber(int rollNo) {
        if (head == null) return;
        if (head.rollNo == rollNo) {
            head = head.next;
            return;
        }
        Student temp = head;
        while (temp.next != null && temp.next.rollNo != rollNo) {
            temp = temp.next;
        }
        if (temp.next == null) return;
        temp.next = temp.next.next;
    }
    public Student searchByRollNumber(int rollNo) {
        Student temp = head;
        while (temp != null) {
            if (temp.rollNo == rollNo) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }
    public void updateGrade(int rollNo, String newGrade) {
        Student student = searchByRollNumber(rollNo);
        if (student != null) {
            student.grade = newGrade;
        }
    }
    public void displayAll() {
        Student temp = head;
        while (temp != null) {
            System.out.println("Roll No: " + temp.rollNo + ", Name: " + temp.name + ", Age: " + temp.age + ", Grade: " + temp.grade);
            temp = temp.next;
        }
    }
}
public class a {
    public static void main(String[] args) {
        StudentLinkedList list = new StudentLinkedList();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1.Add at Beginning\n2.Add at End\n3.Add at Position\n4.Delete by RollNo\n5.Search\n6.Display All\n7.Update Grade\n8.Exit");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    list.addAtBeginning(sc.nextInt(), sc.next(), sc.nextInt(), sc.next());
                    break;
                case 2:
                    list.addAtEnd(sc.nextInt(), sc.next(), sc.nextInt(), sc.next());
                    break;
                case 3:
                    int pos = sc.nextInt();
                    list.addAtPosition(pos, sc.nextInt(), sc.next(), sc.nextInt(), sc.next());
                    break;
                case 4:
                    list.deleteByRollNumber(sc.nextInt());
                    break;
                case 5:
                    Student s = list.searchByRollNumber(sc.nextInt());
                    if (s != null)
                        System.out.println("Found: " + s.name);
                    else
                        System.out.println("Not Found");
                    break;
                case 6:
                    list.displayAll();
                    break;
                case 7:
                    list.updateGrade(sc.nextInt(), sc.next());
                    break;
                case 8:
                    return;
            }
        }
    }
}