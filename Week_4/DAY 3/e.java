import java.io.*;
import java.util.Arrays;
public class e {
    public static void main(String[] args) {
        String sourceImagePath = "original.jpg";
        String destinationImagePath = "copy.jpg";
        try {
            FileInputStream fis = new FileInputStream(sourceImagePath);
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                baos.write(buffer, 0, bytesRead);
            }
            byte[] imageBytes = baos.toByteArray();
            fis.close();
            baos.close();
            ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
            FileOutputStream fos = new FileOutputStream(destinationImagePath);
            while ((bytesRead = bais.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
            bais.close();
            fos.close();
            boolean areEqual = compareFiles(sourceImagePath, destinationImagePath);
            System.out.println("Image copy successful: " + areEqual);
        } catch (IOException e) {
            System.out.println("IO Error: " + e.getMessage());
        }
    }
    public static boolean compareFiles(String path1, String path2) {
        try {
            FileInputStream f1 = new FileInputStream(path1);
            FileInputStream f2 = new FileInputStream(path2);
            byte[] file1Bytes = f1.readAllBytes();
            byte[] file2Bytes = f2.readAllBytes();
            f1.close();
            f2.close();
            return Arrays.equals(file1Bytes, file2Bytes);
        } catch (IOException e) {
            System.out.println("File comparison error: " + e.getMessage());
            return false;
        }
    }
}