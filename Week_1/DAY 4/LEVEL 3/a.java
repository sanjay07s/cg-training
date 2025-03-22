import java.util.Random;
public class a {
   public static int[] generatePlayerHeights(int size) {
        Random rand = new Random();
        int[] heights = new int[size];
        for (int i = 0; i < size; i++) {
            heights[i] = rand.nextInt(101) + 150;
        }
        return heights;
    }
    public static int findSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }
    public static double findMeanHeight(int[] heights) {
        int sum = findSum(heights);
        return (double) sum / heights.length;
    }
    public static int findShortestHeight(int[] heights) {
        int minHeight = heights[0];
        for (int height : heights) {
            if (height < minHeight) {
                minHeight = height;
            }
        }
        return minHeight;
    }
    public static int findTallestHeight(int[] heights) {
        int maxHeight = heights[0];
        for (int height : heights) {
            if (height > maxHeight) {
                maxHeight = height;
            }
        }
        return maxHeight;
    }
    public static void main(String[] args) {
        int[] heights = generatePlayerHeights(11);
        System.out.println("Heights of the players (in cms): ");
        for (int height : heights) {
            System.out.print(height + " ");
        }
        System.out.println();
        System.out.println("Shortest height: " + findShortestHeight(heights) + " cms");
        System.out.println("Tallest height: " + findTallestHeight(heights) + " cms");
        System.out.println("Mean height: " + findMeanHeight(heights) + " cms");
    }
}