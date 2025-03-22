import java.util.Scanner;
class g {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        generateException(text);
        handleException(text);
    }
    public static void generateException(String s) {
        int number = Integer.parseInt(s);
        System.out.println(number);
    }
    public static void handleException(String s) {
        try {
            int number = Integer.parseInt(s);
            System.out.println(number);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught");
        }
    }
}