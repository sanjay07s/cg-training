import java.util.Scanner;
class b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[] customSplit = customSplit(text);
        String[] builtInSplit = text.split(" ");
        boolean result = compareArrays(customSplit, builtInSplit);
        System.out.println("Custom split result: ");
        for (String word : customSplit) {
            System.out.println(word);
        }
        System.out.println("Built-in split result: ");
        for (String word : builtInSplit) {
            System.out.println(word);
        }
        System.out.println("Arrays match: " + result);
    }
    public static String[] customSplit(String s) {
        int wordCount = countWords(s);
        int[] spaceIndexes = new int[wordCount - 1];
        int index = 0, spaceIndex = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                spaceIndexes[index++] = i;
            }
        }
        String[] words = new String[wordCount];
        int start = 0;
        for (int i = 0; i < wordCount; i++) {
            int end = (i < wordCount - 1) ? spaceIndexes[i] : s.length();
            words[i] = s.substring(start, end);
            start = spaceIndexes[i] + 1;
        }
        return words;
    }
    public static int countWords(String s) {
        int count = 1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                count++;
            }
        }
        return count;
    }
    public static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) return false;
        }
        return true;
    }
}