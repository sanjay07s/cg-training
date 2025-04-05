import java.util.Scanner;
class Task {
    int taskId;
    String taskName;
    int priority;
    String dueDate;
    Task next;
    public Task(int taskId, String taskName, int priority, String dueDate) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.priority = priority;
        this.dueDate = dueDate;
        this.next = null;
    }
}
class CircularTaskList {
    private Task head = null;
    private Task tail = null;
    public void addAtBeginning(int taskId, String taskName, int priority, String dueDate) {
        Task newTask = new Task(taskId, taskName, priority, dueDate);
        if (head == null) {
            head = tail = newTask;
            newTask.next = head;
        } else {
            newTask.next = head;
            head = newTask;
            tail.next = head; 
        }
    }
    public void addAtEnd(int taskId, String taskName, int priority, String dueDate) {
        Task newTask = new Task(taskId, taskName, priority, dueDate);
        if (head == null) {
            head = tail = newTask;
            newTask.next = head; 
        } else {
            tail.next = newTask;
            tail = newTask;
            tail.next = head;
        }
    }
    public void addAtPosition(int pos, int taskId, String taskName, int priority, String dueDate) {
        if (pos == 1) {
            addAtBeginning(taskId, taskName, priority, dueDate);
            return;
        }
        Task newTask = new Task(taskId, taskName, priority, dueDate);
        Task temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            addAtEnd(taskId, taskName, priority, dueDate);
        } else {
            newTask.next = temp.next;
            temp.next = newTask;
        }
    }
    public void removeByTaskId(int taskId) {
        if (head == null) return;
        Task temp = head;
        Task prev = null;
        do {
            if (temp.taskId == taskId) {
                if (prev == null) {
                    if (head == head.next) { 
                        head = tail = null;
                    } else {
                        head = head.next;
                        tail.next = head;
                    }
                } else {
                    prev.next = temp.next;
                    if (temp == tail) {
                        tail = prev;
                    }
                }
                return;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);
    }
    public void viewCurrentTask() {
        if (head == null) {
            System.out.println("No tasks available.");
            return;
        }
        Task temp = head;
        System.out.println("Current Task: " + temp.taskName);
    }
    public void moveToNextTask() {
        if (head == null) {
            System.out.println("No tasks available.");
            return;
        }
        head = head.next;
        System.out.println("Moved to next task: " + head.taskName);
    }
    public void displayAllTasks() {
        if (head == null) {
            System.out.println("No tasks available.");
            return;
        }
        Task temp = head;
        do {
            System.out.println("Task ID: " + temp.taskId + ", Task Name: " + temp.taskName + ", Priority: " + temp.priority + ", Due Date: " + temp.dueDate);
            temp = temp.next;
        } while (temp != head);
    }
    public void searchByPriority(int priority) {
        Task temp = head;
        boolean found = false;
        do {
            if (temp.priority == priority) {
                System.out.println("Task Found: " + temp.taskName + " with priority " + temp.priority);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);
        if (!found) {
            System.out.println("No task found with priority " + priority);
        }
    }
}
public class c {
    public static void main(String[] args) {
        CircularTaskList taskList = new CircularTaskList();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. Add at Beginning\n2. Add at End\n3. Add at Position\n4. Remove by Task ID\n5. View Current Task\n6. Move to Next Task\n7. Display All Tasks\n8. Search by Priority\n9. Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    taskList.addAtBeginning(sc.nextInt(), sc.next(), sc.nextInt(), sc.next());
                    break;
                case 2:
                    taskList.addAtEnd(sc.nextInt(), sc.next(), sc.nextInt(), sc.next());
                    break;
                case 3:
                    int pos = sc.nextInt();
                    taskList.addAtPosition(pos, sc.nextInt(), sc.next(), sc.nextInt(), sc.next());
                    break;
                case 4:
                    taskList.removeByTaskId(sc.nextInt());
                    break;
                case 5:
                    taskList.viewCurrentTask();
                    break;
                case 6:
                    taskList.moveToNextTask();
                    break;
                case 7:
                    taskList.displayAllTasks();
                    break;
                case 8:
                    taskList.searchByPriority(sc.nextInt());
                    break;
                case 9:
                    return;
            }
        }
    }
}