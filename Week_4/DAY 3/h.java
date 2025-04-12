import java.io.*;
import java.util.concurrent.*;
public class h {
    public static void main(String[] args) {
        PipedOutputStream pipedOutput = new PipedOutputStream();
        PipedInputStream pipedInput = null;
        try {
            pipedInput = new PipedInputStream(pipedOutput);
            Thread writerThread = new Thread(new Writer(pipedOutput));
            Thread readerThread = new Thread(new Reader(pipedInput));
            writerThread.start();
            readerThread.start();
            writerThread.join();
            readerThread.join();
        } catch (IOException | InterruptedException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
        static class Writer implements Runnable {
        private PipedOutputStream pipedOutput;
        public Writer(PipedOutputStream pipedOutput) {
            this.pipedOutput = pipedOutput;
        }
        public void run() {
            try {
                String message = "Hello from Writer Thread!";
                pipedOutput.write(message.getBytes());
                pipedOutput.close();
                System.out.println("Writer thread finished writing.");
            } catch (IOException e) {
                System.out.println("Error in Writer thread: " + e.getMessage());
            }
        }
    }
    static class Reader implements Runnable {
        private PipedInputStream pipedInput;
        public Reader(PipedInputStream pipedInput) {
            this.pipedInput = pipedInput;
        }
        public void run() {
            try {
                int data;
                StringBuilder message = new StringBuilder();
                while ((data = pipedInput.read()) != -1) {
                    message.append((char) data);
                }
                System.out.println("Reader thread received message: " + message.toString());
                pipedInput.close();
            } catch (IOException e) {
                System.out.println("Error in Reader thread: " + e.getMessage());
            }
        }
    }
}