package DSAsheetByArsh.StacksAndQueues;

import java.util.Stack;

public class onlineStockSpan {
    Stack<int[]> s = new Stack<>();

    public int next(int price) {
        int span = 1;
        while(!s.isEmpty() && s.peek()[0] <=price ){
            span += s.peek()[1];
            s.pop();
        }
        s.push(new int[]{price, span});
        return span;
    }
}
