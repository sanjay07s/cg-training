import java.util.*;
public class h {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(5);
        set.add(3);
        set.add(9);
        set.add(1);
        System.out.println("Original Set: " + set);
        List<Integer> sortedList = convertToSortedList(set);
        System.out.println("Sorted List: " + sortedList);
    }
        public static List<Integer> convertToSortedList(Set<Integer> set) {
        List<Integer> list = new ArrayList<>(set); 
        Collections.sort(list); 
        return list;
    }
}
