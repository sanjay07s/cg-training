import java.util.Scanner;
class TextState {
    String text;
    TextState prev, next;
    public TextState(String text) {
        this.text = text;
        this.prev = this.next = null;
    }
}
class TextEditor {
    private TextState currentState;
    private int historyLimit;
    private int historySize;
    private TextState head, tail;
    public TextEditor(int historyLimit) {
        this.historyLimit = historyLimit;
        this.historySize = 0;
        this.head = this.tail = this.currentState = null;
    }
    public void addTextState(String newText) {
        TextState newState = new TextState(newText);
        
        if (historySize == historyLimit) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
            historySize--;
        }
        if (currentState != null) {
            currentState.next = newState;
            newState.prev = currentState;
        }
        currentState = newState;
        if (head == null) {
            head = newState;
        }
        if (tail == null || tail == currentState) {
            tail = currentState;
        }
        historySize++;
        System.out.println("Text added: " + newText);
    }
    public void undo() {
        if (currentState != null && currentState.prev != null) {
            currentState = currentState.prev;
            System.out.println("Undo: " + currentState.text);
        } else {
            System.out.println("Nothing to undo.");
        }
    }
    public void redo() {
        if (currentState != null && currentState.next != null) {
            currentState = currentState.next;
            System.out.println("Redo: " + currentState.text);
        } else {
            System.out.println("Nothing to redo.");
        }
    }
        public void displayCurrentState() {
        if (currentState != null) {
            System.out.println("Current text: " + currentState.text);
        } else {
            System.out.println("No text state available.");
        }
    }
}
public class h {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TextEditor editor = new TextEditor(10);
        while (true) {
            System.out.println("\nText Editor - Undo/Redo");
            System.out.println("1. Add Text");
            System.out.println("2. Undo");
            System.out.println("3. Redo");
            System.out.println("4. Show Current Text");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter text to add: ");
                    String newText = sc.nextLine();
                    editor.addTextState(newText);
                    break;
                case 2:
                    editor.undo();
                    break;
                case 3:
                    editor.redo();
                    break;
                case 4:
                    editor.displayCurrentState();
                    break;
                case 5:
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}