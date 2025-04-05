public class g {
    public static void countingSort(int[] ages) {
        int min = 10;
        int max = 18;
        int range = max - min + 1;
        int[] count = new int[range];
        int[] output = new int[ages.length];
        for (int age : ages) {
            count[age - min]++;
        }
        for (int i = 1; i < range; i++) {
            count[i] += count[i - 1];
        }
        for (int i = ages.length - 1; i >= 0; i--) {
            output[count[ages[i] - min] - 1] = ages[i];
            count[ages[i] - min]--;
        }
        for (int i = 0; i < ages.length; i++) {
            ages[i] = output[i];
        }
    }
    public static void printArray(int[] ages) {
        for (int age : ages) {
            System.out.print(age + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] studentAges = {12, 15, 10, 14, 18, 13, 15, 11, 17};
        countingSort(studentAges);
        printArray(studentAges);
    }
}