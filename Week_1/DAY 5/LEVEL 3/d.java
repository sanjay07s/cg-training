import java.util.Scanner;
public class d {
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
    public static String[][] findCharacterFrequency(String text) {
        int[] frequency = new int[256];r
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            frequency[currentChar]++;
        }
        String[][] result = new String[256][2];
        int index = 0;
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                result[index][0] = String.valueOf((char) i);
                result[index][1] = String.valueOf(frequency[i]);
                index++;
            }
        }
        return result;
    }
}