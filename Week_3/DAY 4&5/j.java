public class j {
    public static String findSentenceWithWord(String[] sentences, String word) {
        for (String sentence : sentences) {
            if (sentence.contains(word)) {
                return sentence;
            }
        }
        return "Not Found";
    }
    public static void main(String[] args) {
        String[] sentences = {
            "The quick brown fox jumps over the lazy dog.",
            "Hello world, welcome to Java.",
            "I am learning Linear Search.",
            "This is another example sentence."
        };
        String word = "Java";
        String result = findSentenceWithWord(sentences, word);
        System.out.println("Sentence containing the word: " + result);
    }
}