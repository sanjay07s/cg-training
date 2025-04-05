public class e {
    public static void selectionSort(int[] scores) {
        int n = scores.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (scores[j] < scores[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = scores[minIndex];
            scores[minIndex] = scores[i];
            scores[i] = temp;
        }
    }
    public static void printArray(int[] scores) {
        for (int score : scores) {
            System.out.print(score + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] examScores = {85, 72, 93, 67, 88};
        selectionSort(examScores);
        printArray(examScores);
    }
}