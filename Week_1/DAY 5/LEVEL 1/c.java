import java.util.Scanner;
class c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        char[] customArray = getChars(text);
        char[] builtInArray = text.toCharArray();
        boolean result = compareArrays(customArray, builtInArray);
        System.out.println("Arrays match: " + result);
    }
    public static char[] getChars(String s) {
        char[] arr = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i);
        }
        return arr;
    }
    public static boolean compareArrays(char[] a, char[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }
}