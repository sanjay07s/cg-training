import java.io.*;
public class b {
    public static void main(String[] args) {
        String sourcePath = "largefile.dat";
        String destBufferedPath = "buffered_copy.dat";
        String destUnbufferedPath = "unbuffered_copy.dat";
        copyWithUnbufferedStreams(sourcePath, destUnbufferedPath);
        copyWithBufferedStreams(sourcePath, destBufferedPath);
    }
    public static void copyWithUnbufferedStreams(String source, String destination) {
        File sourceFile = new File(source);
        File destFile = new File(destination);
        try (FileInputStream fis = new FileInputStream(sourceFile);
             FileOutputStream fos = new FileOutputStream(destFile)) {
            byte[] buffer = new byte[4096];
            int bytesRead;
            long startTime = System.nanoTime();
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
            long endTime = System.nanoTime();
            System.out.println("Unbuffered copy completed in " + (endTime - startTime) / 1_000_000 + " ms.");
        } catch (IOException e) {
            System.out.println("Unbuffered copy error: " + e.getMessage());
        }
    }
    public static void copyWithBufferedStreams(String source, String destination) {
        File sourceFile = new File(source);
        File destFile = new File(destination);
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sourceFile));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile))) {
            byte[] buffer = new byte[4096];
            int bytesRead;
            long startTime = System.nanoTime();
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
            long endTime = System.nanoTime();
            System.out.println("Buffered copy completed in " + (endTime - startTime) / 1_000_000 + " ms.");
        } catch (IOException e) {
            System.out.println("Buffered copy error: " + e.getMessage());
        }
    }
}