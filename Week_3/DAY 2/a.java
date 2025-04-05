import java.util.Stack;
public class a {
    Stack<Integer> stackEnqueue = new Stack<>();
    Stack<Integer> stackDequeue = new Stack<>();
    public void enqueue(int x) {
        stackEnqueue.push(x);
    }
    public int dequeue() {
        if (stackDequeue.isEmpty()) {
            while (!stackEnqueue.isEmpty()) {
                stackDequeue.push(stackEnqueue.pop());
            }
        }
        if (stackDequeue.isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return stackDequeue.pop();
    }
    public int peek() {
        if (stackDequeue.isEmpty()) {
            while (!stackEnqueue.isEmpty()) {
                stackDequeue.push(stackEnqueue.pop());
            }
        }
        if (stackDequeue.isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return stackDequeue.peek();
    }
    public boolean isEmpty() {
        return stackEnqueue.isEmpty() && stackDequeue.isEmpty();
    }
    public static void main(String[] args) {
        QueueUsingStacks queue = new QueueUsingStacks();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println(queue.dequeue());
        System.out.println(queue.peek());
        System.out.println(queue.dequeue());
        System.out.println(queue.isEmpty());
    }
}