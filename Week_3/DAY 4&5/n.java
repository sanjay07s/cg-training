public class n {
    public static int[] findFirstAndLast(int[] nums, int target) {
        int[] result = {-1, -1};
        result[0] = findOccurrence(nums, target, true);
        if (result[0] != -1) {
            result[1] = findOccurrence(nums, target, false);
        }
        
        return result;
    }
    private static int findOccurrence(int[] nums, int target, boolean findFirst) {
        int left = 0, right = nums.length - 1;
        int occurrence = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                occurrence = mid;
                if (findFirst) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return occurrence;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 3, 3, 4, 5, 6};
        int target = 3;
        int[] result = findFirstAndLast(nums, target);
        System.out.println("First occurrence: " + result[0]);
        System.out.println("Last occurrence: " + result[1]);
    }
}