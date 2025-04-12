import java.util.*;
public class m {
    private Queue<Integer> queue1;
    private Queue<Integer> queue2;
    public StackUsingQueues() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }
    public void push(int x) {
        queue1.add(x);
    }
    public int pop() {
       while (queue1.size() > 1) {
            queue2.add(queue1.remove());
        }
        int top = queue1.remove();
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
        return top;
    }
    public int top() {
        while (queue1.size() > 1) {
            queue2.add(queue1.remove());
        }
            int top = queue1.peek();
        queue2.add(queue1.remove());
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
        return top;
    }
    public static void main(String[] args) {
        StackUsingQueues stack = new StackUsingQueues();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Top element: " + stack.top());  
        System.out.println("Popped element: " + stack.pop()); 
        System.out.println("Top element after pop: " + stack.top()); 
    }
}