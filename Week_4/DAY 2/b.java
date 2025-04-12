import java.util.*;
public class b {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("apple");
        list.add("orange");
        Map<String, Integer> frequencyMap = countFrequency(list);
        System.out.println(frequencyMap);
    }
    public static Map<String, Integer> countFrequency(List<String> list) {
        Map<String, Integer> frequencyMap = new HashMap<>();
        for (String element : list) {
            frequencyMap.put(element, frequencyMap.getOrDefault(element, 0) + 1);
        }
        return frequencyMap;
    }
}