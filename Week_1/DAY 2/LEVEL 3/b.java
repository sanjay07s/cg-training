import java.util.Scanner;

public class b {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int year = s.nextInt();
        
        if (year >= 1582 && (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))) {
            System.out.println("It's a leap year");
        } else if (year < 1582) {
            System.out.println("Not applicable");
        } else {
            System.out.println("It's not a leap year");
        }
        
        s.close();
    }
}