import java.io.*;
public class h {
    public static void main(String[] args) {
        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            FileWriter writer = new FileWriter("output.txt");
            String input;
            System.out.println("Enter text (type 'exit' to finish):");
                while (true) {
                input = br.readLine();
                if ("exit".equalsIgnoreCase(input)) {
                    break;
                }
                writer.write(input + "\n");
            }
            writer.close();
            br.close();
            isr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}