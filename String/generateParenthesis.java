package DSAsheetByArsh.String;

import java.util.*;

public class generateParenthesis {
    public static List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        int close = n;
        String output = "";
        int open = n;
        helper(list, open, close, output);
        return list;
    }
    public static void helper(List<String> list, int open, int close, String output){
        if(open == 0 && close == 0){
            list.add(output);
            return;
        }
        if(open < close){
            String op1 = output + ")";
            helper(list, open, close-1, op1);
        }
        if(open != 0) {
            String op2 = output + "(";
            helper(list, open-1, close, op2);
        }
    }

    public static void main(String[] args) {
        System.out.println(generateParenthesis(3));
    }
}
