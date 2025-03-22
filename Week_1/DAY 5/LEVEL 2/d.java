import java.util.Scanner;
class d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[] words = customSplit(text);
        String[][] wordWithLengths = getWordWithLengths(words);
        int[] minMax = findShortestAndLongest(wordWithLengths);
        System.out.println("Shortest word: " + words[minMax[0]] + " (Length: " + minMax[1] + ")");
        System.out.println("Longest word: " + words[minMax[2]] + " (Length: " + minMax[3] + ")");
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
    public static int[] findShortestAndLongest(String[][] wordWithLengths) {
        int shortestIndex = 0, longestIndex = 0;
        int shortestLength = Integer.MAX_VALUE, longestLength = Integer.MIN_VALUE;
        for (int i = 0; i < wordWithLengths.length; i++) {
            int length = Integer.parseInt(wordWithLengths[i][1]);
            if (length < shortestLength) {
                shortestLength = length;
                shortestIndex = i;
            }
            if (length > longestLength) {
                longestLength = length;
                longestIndex = i;
            }
        }
        return new int[]{shortestIndex, shortestLength, longestIndex, longestLength};
    }
}