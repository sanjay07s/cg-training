import java.util.Scanner;
class Process {
    int processId;
    int burstTime;
    int priority;
    Process next;
    public Process(int processId, int burstTime, int priority) {
        this.processId = processId;
        this.burstTime = burstTime;
        this.priority = priority;
        this.next = null;
    }
}
class RoundRobinScheduling {
    private Process head = null;
    private Process tail = null;
    private int totalProcesses = 0;
    public void addProcess(int processId, int burstTime, int priority) {
        Process newProcess = new Process(processId, burstTime, priority);
        if (head == null) {
            head = tail = newProcess;
            newProcess.next = head;
        } else {
            tail.next = newProcess;
            tail = newProcess;
            tail.next = head;
        }
        totalProcesses++;
    }
    public void removeProcess(int processId) {
        if (head == null) return;
        Process temp = head;
        Process prev = null;
        if (head.processId == processId) {
            if (head.next == head) {
                head = tail = null;
            } else {
                tail.next = head.next;
                head = head.next;
            }
            totalProcesses--;
            return;
        }
            do {
            prev = temp;
            temp = temp.next;
            if (temp.processId == processId) {
                prev.next = temp.next;
                if (temp == tail) {
                    tail = prev;
                }
                totalProcesses--;
                return;
            }
        } while (temp != head);
    }
        public void simulateRoundRobin(int timeQuantum) {
        if (head == null) {
            System.out.println("No processes to schedule.");
            return;
        }
        Process temp = head;
        int totalWaitTime = 0;
        int totalTurnaroundTime = 0;
        while (totalProcesses > 0) {
            if (temp.burstTime > 0) {
                int executedTime = Math.min(temp.burstTime, timeQuantum);
                temp.burstTime -= executedTime;
                System.out.println("Process " + temp.processId + " executed for " + executedTime + " units.");
                totalWaitTime += totalProcesses * executedTime;
                totalTurnaroundTime += executedTime + temp.burstTime;
                if (temp.burstTime == 0) {
                    System.out.println("Process " + temp.processId + " completed.");
                    removeProcess(temp.processId);
                }
            }
            temp = temp.next;
        }
        System.out.println("Scheduling completed.");
        System.out.println("Average Waiting Time: " + (totalWaitTime / (double) totalProcesses));
        System.out.println("Average Turnaround Time: " + (totalTurnaroundTime / (double) totalProcesses));
    }
    public void displayProcesses() {
        if (head == null) {
            System.out.println("No processes in the queue.");
            return;
        }
        Process temp = head;
        do {
            System.out.println("Process ID: " + temp.processId + ", Burst Time: " + temp.burstTime + ", Priority: " + temp.priority);
            temp = temp.next;
        } while (temp != head);
    }
}
public class f {
    public static void main(String[] args) {
        RoundRobinScheduling rrScheduling = new RoundRobinScheduling();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. Add Process\n2. Display Processes\n3. Simulate Round Robin Scheduling\n4. Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter Process ID, Burst Time, and Priority:");
                    rrScheduling.addProcess(sc.nextInt(), sc.nextInt(), sc.nextInt());
                    break;
                case 2:
                    rrScheduling.displayProcesses();
                    break;
                case 3:
                    System.out.println("Enter Time Quantum:");
                    rrScheduling.simulateRoundRobin(sc.nextInt());
                    break;
                case 4:
                    sc.close();
                    return;
            }
        }
    }
}