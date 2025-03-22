import java.util.Scanner;
public class b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        int handshakes = calculateHandshakes(n);
        System.out.println("Maximum number of handshakes among " + n + " students is " + handshakes);
    }
    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }
}