import java.util.Scanner;
public class b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        int length = findLength(text);
        char[] uniqueChars = findUniqueCharacters(text, length);
        System.out.println("Unique characters in the string are:");
        for (char c : uniqueChars) {
            System.out.print(c + " ");
        }
    }
    public static int findLength(String text) {
        int length = 0;
        try {
            while (true) {
                text.charAt(length);
                length++;
            }
        } catch (StringIndexOutOfBoundsException e) {
        }
        return length;
    }
    public static char[] findUniqueCharacters(String text, int length) {
        boolean[] isUnique = new boolean[length];
        char[] result = new char[length];
        int resultIndex = 0;
        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            boolean isCurrentUnique = true;
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == currentChar) {
                    isCurrentUnique = false;
                    break;
                }
            }
            if (isCurrentUnique) {
                result[resultIndex++] = currentChar;
            }
        }
        char[] uniqueChars = new char[resultIndex];
        System.arraycopy(result, 0, uniqueChars, 0, resultIndex);
        return uniqueChars;
    }
}