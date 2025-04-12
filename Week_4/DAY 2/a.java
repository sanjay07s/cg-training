import java.util.ArrayList;
import java.util.LinkedList;
public class a {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        System.out.println("Original ArrayList: " + arrayList);
        reverseArrayList(arrayList);
        System.out.println("Reversed ArrayList: " + arrayList);
        System.out.println("\nOriginal LinkedList: " + linkedList);
        reverseLinkedList(linkedList);
        System.out.println("Reversed LinkedList: " + linkedList);
    }
    public static void reverseArrayList(ArrayList<Integer> list) {
        int start = 0;
        int end = list.size() - 1;
        while (start < end) {
            int temp = list.get(start);
            list.set(start, list.get(end));
            list.set(end, temp);
            start++;
            end--;
        }
    }
    public static void reverseLinkedList(LinkedList<Integer> list) {
        LinkedList<Integer> tempList = new LinkedList<>();
        while (!list.isEmpty()) {
            tempList.addFirst(list.poll());
        }
        list.addAll(tempList);
    }
}