import java.util.*;
public class e {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        int N = 2;
        System.out.println("Original LinkedList: " + list);
        String nthElement = findNthFromEnd(list, N);
        System.out.println("The " + N + "th element from the end is: " + nthElement);
    }
    public static String findNthFromEnd(LinkedList<String> list, int N) {
        LinkedList<String> tempList = new LinkedList<>(list); 
        int size = tempList.size();
        if (N > size) {
            return "Invalid position"; 
        }
        int targetIndex = size - N;
        return tempList.get(targetIndex);
    }
}
