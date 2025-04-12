import java.util.*;
public class f {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set2.add(3);
        set2.add(2);
        set2.add(1);
        System.out.println("Set1: " + set1);
        System.out.println("Set2: " + set2);
        boolean areEqual = areSetsEqual(set1, set2);
        System.out.println("Are the sets equal? " + areEqual);
    }
    public static boolean areSetsEqual(Set<Integer> set1, Set<Integer> set2) {
        return set1.equals(set2);
    }
}
Union and Intersection of Two Sets
Given two sets, compute their union and intersection.
Example:
Set1: {1, 2, 3}, Set2: {3, 4, 5} → Union: {1, 2, 3, 4, 5}, Intersection: {3}.
import java.util.*;
public class SetUnionIntersection {
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
        Set<Integer> union = findUnion(set1, set2);
        Set<Integer> intersection = findIntersection(set1, set2);
        System.out.println("Union: " + union);
        System.out.println("Intersection: " + intersection);
    }
    public static Set<Integer> findUnion(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);
        return unionSet;
    }
    public static Set<Integer> findIntersection(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> intersectionSet = new HashSet<>(set1);
        intersectionSet.retainAll(set2);
        return intersectionSet;
    }
}
