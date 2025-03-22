public class g {
    public static void main(String[] args) {
        int[] otpNumbers = new int[10];
        for (int i = 0; i < 10; i++) {
            otpNumbers[i] = generateOTP();
        }
        boolean areUnique = checkUnique(otpNumbers);
        if (areUnique) {
            System.out.println("All OTPs are unique.");
        } else {
            System.out.println("Some OTPs are repeated.");
        }
    }
    public static int generateOTP() {
        int otp = (int) (Math.random() * 900000) + 100000;
        return otp;
    }
    public static boolean checkUnique(int[] otpNumbers) {
        HashSet<Integer> otpSet = new HashSet<>();
        for (int otp : otpNumbers) {
            otpSet.add(otp);
        }
        return otpSet.size() == otpNumbers.length;
    }
}