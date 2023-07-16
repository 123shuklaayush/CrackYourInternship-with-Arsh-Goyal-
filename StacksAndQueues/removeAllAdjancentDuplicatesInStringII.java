package DSAsheetByArsh.StacksAndQueues;

import java.util.*;

public class removeAllAdjancentDuplicatesInStringII {
    public static String removeDuplicates(String s, int k) {
        Stack<int[]> stack = new Stack<>();
        for(char ch: s.toCharArray()){
            if(!stack.isEmpty() && stack.peek()[0] == ch){
                stack.peek()[1]++;
            }
            else stack.push(new int[]{ch, 1});
            if(stack.peek()[1] == k) stack.pop();
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            int top[] = stack.pop();
            while(top[1]-- > 0){
                sb.append((char) top[0]);
            }
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates("deeedbbcccbdaa", 3));
    }
}
