import java.util.*;
public class g {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set2.add(3);
        set2.add(4);
        set2.add(5);
        System.out.println("Set1: " + set1);
        System.out.println("Set2: " + set2);
        Set<Integer> symmetricDifference = findSymmetricDifference(set1, set2);
        System.out.println("Symmetric Difference: " + symmetricDifference);
    }
    public static Set<Integer> findSymmetricDifference(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> symmetricDifference = new HashSet<>(set1);
        symmetricDifference.addAll(set2); 
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2); 
        symmetricDifference.removeAll(intersection); 
        return symmetricDifference;
    }
}
