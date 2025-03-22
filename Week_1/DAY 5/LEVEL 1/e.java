import java.util.Scanner;
class e {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        generateException(text);
        handleException(text);
    }
    public static void generateException(String s) {
        System.out.println(s.charAt(s.length()));
    }
    public static void handleException(String s) {
        try {
            System.out.println(s.charAt(s.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException caught");
        }
    }
}