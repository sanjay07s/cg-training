import java.util.*;
public class c {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        int positions = 2;
        System.out.println("Original List: " + list);
        rotateList(list, positions);
        System.out.println("List after rotation by " + positions + " positions: " + list);
    }
    public static void rotateList(List<Integer> list, int positions) {
        int size = list.size();
        positions = positions % size; 
        Collections.rotate(list, positions);
    }
}