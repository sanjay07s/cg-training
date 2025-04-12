import java.io.*;
public class f {
    public static void main(String[] args) {
        String sourceFile = "source.txt";
        String destFile = "destination.txt";
        try (
            BufferedReader br = new BufferedReader(new FileReader(sourceFile));
            BufferedWriter bw = new BufferedWriter(new FileWriter(destFile))
        ) {
            String line;
            while ((line = br.readLine()) != null) {
                String modifiedLine = line.toLowerCase();
                bw.write(modifiedLine);
                bw.newLine();
            }
            System.out.println("File conversion completed successfully.");
        } catch (IOException e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
}