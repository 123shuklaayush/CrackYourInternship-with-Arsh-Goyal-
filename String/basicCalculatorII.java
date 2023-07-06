package DSAsheetByArsh.String;

import java.util.Stack;

public class basicCalculatorII {
    public static int calculate(String s) {
        Stack<Integer> st = new Stack<>();
        if(s.length() == 0 || s== null) return 0;
        int curr = 0;
        int op = '+';
        char[] c= s.toCharArray();
        int n = c.length;
        for(int i = 0; i< n; i++){
            if(Character.isDigit(c[i])){
                curr = curr * 10 + c[i] - '0';
            }
            if(!Character.isDigit(c[i]) && c[i] != ' ' || i == c.length-1){
                if(op == '+'){
                    st.push(curr);
                }
                else if(op == '-'){
                    st.push(-curr);
                }
                else if(op == '*'){
                    st.push(st.pop() * curr);
                }
                else if(op == '/'){
                    st.push(st.pop() / curr);
                }
                op = c[i];
                curr = 0;
            }
        }
        int sum = 0;
        while(!st.isEmpty())
            sum += st.pop();
        return sum;
    }
    public static void main(String[] args) {
        String s = "12*4+1";
        System.out.println(calculate(s));
    }
}
