import java.io.*;
import java.util.*;
public class o {
    public static void main(String[] args) {
        String fileName = "sample.txt"; 
        Map<String, Integer> wordCount = countWordFrequency(fileName);
        System.out.println(wordCount);
    }
        public static Map<String, Integer> countWordFrequency(String fileName) {
        Map<String, Integer> wordCount = new HashMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
               line = line.replaceAll("[^a-zA-Z ]", "").toLowerCase();
               String[] words = line.split("\\s+");
               for (String word : words) {
                    if (!word.isEmpty()) {
                        wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return wordCount;
    }
}