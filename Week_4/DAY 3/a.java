import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class a {
    public static void main(String[] args) {
        File sourceFile = new File("source.txt");
        File destFile = new File("destination.txt");
        if (!sourceFile.exists()) {
            System.out.println("Source file does not exist.");
            return;
        }
        try (FileInputStream fis = new FileInputStream(sourceFile);
             FileOutputStream fos = new FileOutputStream(destFile)) {
            int content;
            while ((content = fis.read()) != -1) {
                fos.write(content);
            }
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}