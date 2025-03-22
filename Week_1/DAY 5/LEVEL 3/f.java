import java.util.Scanner;
public class f {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        String[] result = findCharacterFrequency(text);
        System.out.println("Character | Frequency");
        for (String entry : result) {
            if (entry != null) {
                System.out.println(entry);
            }
        }
    }
    public static String[] findCharacterFrequency(String text) {
        char[] chars = text.toCharArray();
        int[] frequency = new int[chars.length];
        String[] result = new String[chars.length];
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '0') {
                continue;
            }
            frequency[i] = 1;

            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    frequency[i]++;
                    chars[j] = '0';
                }
            }
            result[i] = String.valueOf(chars[i]) + " : " + frequency[i];
        }
        return result;
    }
}