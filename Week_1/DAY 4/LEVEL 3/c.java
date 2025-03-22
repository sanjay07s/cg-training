import java.util.Arrays;
public class c {
    public static int countDigits(int number) {
        return Integer.toString(number).length();
    }
    public static int[] storeDigits(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }
    public static int sumOfDigits(int number) {
        int[] digits = storeDigits(number);
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }
    public static double sumOfSquaresOfDigits(int number) {
        int[] digits = storeDigits(number);
        double sumOfSquares = 0;
        for (int digit : digits) {
            sumOfSquares += Math.pow(digit, 2);
        }
        return sumOfSquares;
    }
    public static boolean isHarshadNumber(int number) {
        int sum = sumOfDigits(number);
        return number % sum == 0;
    }
    public static int[][] digitFrequency(int number) {
        int[] digits = storeDigits(number);
        int[][] frequency = new int[10][2];
        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i; 
            frequency[i][1] = 0; 
        }
        for (int digit : digits) {
            frequency[digit][1]++;
        }
        return frequency;
    }

    public static void main(String[] args) {
        int number = 21; 
        int digitCount = countDigits(number);
        System.out.println("Count of digits: " + digitCount);
        int[] digits = storeDigits(number);
        System.out.println("Digits array: " + Arrays.toString(digits));
        int sum = sumOfDigits(number);
        System.out.println("Sum of digits: " + sum);
        double sumOfSquares = sumOfSquaresOfDigits(number);
        System.out.println("Sum of squares of digits: " + sumOfSquares);
        boolean isHarshad = isHarshadNumber(number);
        System.out.println("Is Harshad Number: " + isHarshad);
        int[][] frequency = digitFrequency(number);
        System.out.println("Digit Frequencies:");
        for (int[] freq : frequency) {
            if (freq[1] > 0) {
                System.out.println("Digit: " + freq[0] + " Frequency: " + freq[1]);
            }
        }
    }
}