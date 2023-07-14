package DSAsheetByArsh.StacksAndQueues;
import java.util.*;
public class implementStacksUsingQueue {
    Queue<Integer> q1 = new ArrayDeque<>();

    public void push(int x) {
        Queue<Integer> q2 = new ArrayDeque<>();
        while(!q1.isEmpty())
            q2.add(q1.remove());
        q1.add(x);
        while(!q2.isEmpty())
            q1.add(q2.remove());
    }

    public int pop() {
        return q1.remove();
    }

    public int top() {
        return q1.peek();
    }

    public boolean empty() {
        return q1.isEmpty();
    }
}
