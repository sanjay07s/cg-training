public class e {
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static boolean isNeon(int number) {
        int square = number * number;
        int sumOfDigits = 0;
        while (square != 0) {
            sumOfDigits += square % 10;
            square /= 10;
        }
        return sumOfDigits == number;
    }
    public static boolean isSpyNumber(int number) {
        int sum = 0;
        int product = 1;
        int[] digits = storeDigits(number);
        for (int digit : digits) {
            sum += digit;
            product *= digit;
        }
        return sum == product;
    }
    public static boolean isAutomorphic(int number) {
        int square = number * number;
        int temp = number;
        while (square > 0) {
            if (square % 10 != temp % 10) {
                return false;
            }
            square /= 10;
            temp /= 10;
        }
        return true;
    }
    public static boolean isBuzzNumber(int number) {
        return number % 7 == 0 || number % 10 == 7;
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
    public static int countDigits(int number) {
        return String.valueOf(number).length();
    }
    public static void main(String[] args) {
        int number = 153;
        System.out.println("Is Prime: " + isPrime(number));
        System.out.println("Is Neon: " + isNeon(number));
        System.out.println("Is Spy Number: " + isSpyNumber(number));
        System.out.println("Is Automorphic: " + isAutomorphic(number));
        System.out.println("Is Buzz Number: " + isBuzzNumber(number));
    }
}