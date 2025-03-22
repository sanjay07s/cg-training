import java.util.Scanner;
class c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[] words = customSplit(text);
        String[][] wordWithLengths = getWordWithLengths(words);
        System.out.println("Word\tLength");
        for (int i = 0; i < wordWithLengths.length; i++) {
            System.out.println(wordWithLengths[i][0] + "\t" + Integer.parseInt(wordWithLengths[i][1]));
        }
    }
    public static String[] customSplit(String s) {
        int wordCount = countWords(s);
        String[] words = new String[wordCount];
        int start = 0;
        int wordIndex = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ' || i == s.length() - 1) {
                int end = (i == s.length() - 1) ? i + 1 : i;
                words[wordIndex++] = s.substring(start, end);
                start = i + 1;
            }
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
    public static String[][] getWordWithLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }
        return result;
    }
    public static int findLength(String s) {
        int count = 0;
        try {
            while (true) {
                s.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }
}