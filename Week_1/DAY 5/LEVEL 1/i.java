import java.util.Scanner;
class i {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String customUpperCase = convertToUpperCase(text);
        String builtInUpperCase = text.toUpperCase();
        boolean result = compareStrings(customUpperCase, builtInUpperCase);
        System.out.println("Custom uppercase: " + customUpperCase);
        System.out.println("Built-in uppercase: " + builtInUpperCase);
        System.out.println("Strings match: " + result);
    }
    public static String convertToUpperCase(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                result.append((char)(ch - 32));
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }
}