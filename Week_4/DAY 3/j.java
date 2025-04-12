import java.io.*;
import java.util.*;
public class j {
    public static void main(String[] args) {
        String fileName = "textfile.txt";
        Map<String, Integer> wordCount = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    word = word.toLowerCase().replaceAll("[^a-zA-Z]", "");
                    if (!word.isEmpty()) {
                        wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
        List<Map.Entry<String, Integer>> sortedWords = new ArrayList<>(wordCount.entrySet());
        sortedWords.sort((entry1, entry2) -> entry2.getValue() - entry1.getValue());
        System.out.println("Top 5 most frequent words:");
        int count = 0;
        for (Map.Entry<String, Integer> entry : sortedWords) {
            if (count >= 5) break;
            System.out.println(entry.getKey() + ": " + entry.getValue());
            count++;
        }
    }
}