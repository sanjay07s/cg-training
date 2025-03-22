import java.util.Arrays;
public class b {
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
    public static boolean isDuckNumber(int number) {
        int[] digits = storeDigits(number);
        for (int digit : digits) {
            if (digit != 0) {
                return true;
            }
        }
        return false;
    }
    public static boolean isArmstrongNumber(int number) {
        int[] digits = storeDigits(number);
        int numDigits = digits.length;
        int sum = 0;
        
        for (int digit : digits) {
            sum += Math.pow(digit, numDigits);
        }
        
        return sum == number;
    }
    public static int[] findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
      for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }
        return new int[]{largest, secondLargest};
    }
    public static int[] findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
        }
        return new int[]{smallest, secondSmallest};
    }

    public static void main(String[] args) {
        int number = 153;
        int digitCount = countDigits(number);
        System.out.println("Count of digits: " + digitCount);
        int[] digits = storeDigits(number);
        System.out.println("Digits array: " + Arrays.toString(digits));
        boolean isDuck = isDuckNumber(number);
        System.out.println("Is Duck Number: " + isDuck);
        boolean isArmstrong = isArmstrongNumber(number);
        System.out.println("Is Armstrong Number: " + isArmstrong);
        int[] largestAndSecondLargest = findLargestAndSecondLargest(digits);
        System.out.println("Largest: " + largestAndSecondLargest[0]);
        System.out.println("Second Largest: " + largestAndSecondLargest[1]);
        int[] smallestAndSecondSmallest = findSmallestAndSecondSmallest(digits);
        System.out.println("Smallest: " + smallestAndSecondSmallest[0]);
        System.out.println("Second Smallest: " + smallestAndSecondSmallest[1]);
    }
}