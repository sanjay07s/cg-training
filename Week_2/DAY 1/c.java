import java.util.Scanner
class c {
    String text
    PalindromeChecker(String text) {
        this.text = text
    }
    boolean isPalindrome() {
        int start = 0
        int end = text.length() - 1
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false
            }
            start++
            end--
        }
        return true
    }
    void displayResult() {
        if (isPalindrome()) {
            System.out.println(text + " is a palindrome")
        } else {
            System.out.println(text + " is not a palindrome")
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in)
        System.out.print("Enter text: ")
        String input = scanner.nextLine()
        PalindromeChecker checker = new PalindromeChecker(input)
        checker.displayResult()
    }
}