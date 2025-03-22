import java.util.Scanner;
public class g {
    public static boolean checkPalindrome(String text) {
        int start = 0;
        int end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static boolean checkPalindromeRecursive(String text, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        return checkPalindromeRecursive(text, start + 1, end - 1);
    }
    public static boolean checkPalindromeUsingCharArray(String text) {
        char[] original = text.toCharArray();
        char[] reversed = new char[text.length()];
        int j = 0;
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed[j++] = original[i];
        }
        for (int i = 0; i < original.length; i++) {
            if (original[i] != reversed[i]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        System.out.println("Using loop: " + checkPalindrome(text));
        System.out.println("Using recursion: " + checkPalindromeRecursive(text, 0, text.length() - 1));
        System.out.println("Using char array: " + checkPalindromeUsingCharArray(text));
    }
}