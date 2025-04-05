public class d {
    public static void main(String[] args) {
        int iterations = 1000000;
        long startTime1 = System.nanoTime();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            sbf.append("hello");
        }
        long endTime1 = System.nanoTime();
        System.out.println("StringBuffer Time: " + (endTime1 - startTime1) + " ns");

        long startTime2 = System.nanoTime();
        StringBuilder sbd = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            sbd.append("hello");
        }
        long endTime2 = System.nanoTime();
        System.out.println("StringBuilder Time: " + (endTime2 - startTime2) + " ns");
    }
}