import java.util.Scanner;
class g {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        int[] trimIndexes = trimSpaces(text);
        String trimmedText = createSubstring(text, trimIndexes[0], trimIndexes[1]);
        String builtInTrimmedText = text.trim();
        boolean isEqual = compareStrings(trimmedText, builtInTrimmedText);
        System.out.println("Trimmed text using charAt: \"" + trimmedText + "\"");
        System.out.println("Trimmed text using built-in trim: \"" + builtInTrimmedText + "\"");
        System.out.println("Are the results equal? " + isEqual);
    }
    public static int[] trimSpaces(String s) {
        int start = 0;
        int end = s.length() - 1;
       while (start < s.length() && s.charAt(start) == ' ') {
            start++;
        }
        while (end >= 0 && s.charAt(end) == ' ') {
            end--;
        }
        return new int[]{start, end};
    }
    public static String createSubstring(String s, int start, int end) {
        StringBuilder result = new StringBuilder();
        for (int i = start; i <= end; i++) {
            result.append(s.charAt(i));
        }
        return result.toString();
    }
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}