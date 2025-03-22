import java.util.Scanner;
class h {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = new String[5];
        for (int i = 0; i < 5; i++) {
            names[i] = sc.next();
        }
        generateException(names);
        handleException(names);
    }
    public static void generateException(String[] arr) {
        System.out.println(arr[10]);
    }
    public static void handleException(String[] arr) {
        try {
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught");
        }
    }
}