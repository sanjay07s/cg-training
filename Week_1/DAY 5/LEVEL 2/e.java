import java.util.Scanner;
Class e {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        int[] result = countVowelsAndConsonants(text);
        System.out.println("Vowels: " + result[0]);
        System.out.println("Consonants: " + result[1]);
    }
    public static int[] countVowelsAndConsonants(String s) {
        int vowels = 0;
        int consonants = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            String type = checkCharacterType(c);
            if (type.equals("Vowel")) {
                vowels++;
            } else if (type.equals("Consonant")) {
                consonants++;
            }
        }
        return new int[]{vowels, consonants};
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
}