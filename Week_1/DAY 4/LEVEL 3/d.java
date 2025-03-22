public class d {
    public static int countDigits(int number) {
        return String.valueOf(number).length();
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
    public static int sumDigits(int number) {
        int sum = 0;
        int[] digits = storeDigits(number);
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }
    public static int sumSquareDigits(int number) {
        int sum = 0;
        int[] digits = storeDigits(number);
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }
    public static boolean isHarshadNumber(int number) {
        int sum = sumDigits(number);
        return number % sum == 0;
    }
    public static int[][] digitFrequency(int number) {
        int[] digits = storeDigits(number);
        int[][] frequency = new int[10][2];
        for (int digit : digits) {
            frequency[digit][0] = digit;
            frequency[digit][1]++;
        }
        return frequency;
    }
    public static int[] reverseDigits(int number) {
        int[] digits = storeDigits(number);
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }
    public static boolean areArraysEqual(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
    public static boolean isPalindrome(int number) {
        int[] digits = storeDigits(number);
        int[] reversed = reverseDigits(number);
        return areArraysEqual(digits, reversed);
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
    public static void main(String[] args) {
        int number = 153;
        System.out.println("Count of digits: " + countDigits(number));
        System.out.println("Sum of digits: " + sumDigits(number));
        System.out.println("Sum of squares of digits: " + sumSquareDigits(number));
        System.out.println("Is Harshad Number: " + isHarshadNumber(number));
        System.out.println("Is Palindrome: " + isPalindrome(number));
        System.out.println("Is Duck Number: " + isDuckNumber(number));
    }
}