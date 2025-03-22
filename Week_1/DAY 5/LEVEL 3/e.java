import java.util.Scanner;
public class e {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        String[][] result = findCharacterFrequency(text);
        System.out.println("Character | Frequency");
        for (int i = 0; i < result.length; i++) {
            if (result[i][0] != null) {
                System.out.println(result[i][0] + "         | " + result[i][1]);
            }
        }
    }
    public static String[] uniqueCharacters(String text) {
        StringBuilder uniqueChars = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == currentChar) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                uniqueChars.append(currentChar);
            }
        }
        String[] uniqueArray = new String[uniqueChars.length()];
        for (int i = 0; i < uniqueChars.length(); i++) {
            uniqueArray[i] = String.valueOf(uniqueChars.charAt(i));
        }
        return uniqueArray;
    }
    public static String[][] findCharacterFrequency(String text) {
        int[] frequency = new int[256];
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            frequency[currentChar]++;
        }
        String[] uniqueChars = uniqueCharacters(text);
        String[][] result = new String[uniqueChars.length][2];
        for (int i = 0; i < uniqueChars.length; i++) {
            char currentChar = uniqueChars[i].charAt(0);
            result[i][0] = uniqueChars[i];  
            result[i][1] = String.valueOf(frequency[currentChar]);
        }
        return result;
    }
}