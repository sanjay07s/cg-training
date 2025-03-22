import java.util.Scanner;
Class f {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[][] result = classifyCharacters(text);
        displayResult(result);
    }
    public static String[][] classifyCharacters(String s) {
        String[][] characterTypes = new String[s.length()][2];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            String type = checkCharacterType(c);
            characterTypes[i][0] = String.valueOf(c);
            characterTypes[i][1] = type;
        }
        return characterTypes;
    }
    public static String checkCharacterType(char c) {
        c = Character.toLowerCase(c);
        if (c >= 'a' && c <= 'z') {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }
        return "Not a Letter";
    }
    public static void displayResult(String[][] result) {
        System.out.printf("%-10s%-10s\n", "Character", "Type");
        for (int i = 0; i < result.length; i++) {
            System.out.printf("%-10s%-10s\n", result[i][0], result[i][1]);
        }
    }
}