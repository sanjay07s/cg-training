import java.util.*;
public class h {
    public static int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }
        int longest = 0;
        for (int num : numSet) {
            if (!numSet.contains(num - 1)) {
                int current = num;
                int streak = 1;
                while (numSet.contains(current + 1)) {
                    current++;
                    streak++;
                }
                longest = Math.max(longest, streak);
            }
        }
        return longest;
    }
    public static void main(String[] args) {
        int[] arr = {100, 4, 200, 1, 3, 2};
        int result = longestConsecutive(arr);
        System.out.println(result);
    }
}