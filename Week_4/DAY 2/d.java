import java.util.*;
public class d {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println("Original List: " + list);
        List<Integer> result = removeDuplicates(list);
        System.out.println("List after removing duplicates: " + result);
    }
     public static List<Integer> removeDuplicates(List<Integer> list) {
        Set<Integer> seen = new HashSet<>();
        List<Integer> result = new ArrayList<>();
        for (Integer element : list) {
            if (!seen.contains(element)) {
                seen.add(element);
                result.add(element);
            }
        }
        return result;
    }
}