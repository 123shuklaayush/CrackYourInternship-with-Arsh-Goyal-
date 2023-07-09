package DSAsheetByArsh.MathematicalProblems;

import java.util.ArrayList;

public class happyNumber {
    public static boolean isHappy(int n) {
        int temp = n;
        while(n > 0){
            int sum = 0;
            while(n > 0){
                int rem = n%10;
                sum += Math.pow(rem, 2);
                n = n/10;
            }
            n = sum;
            if(sum == 1) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int n = 19;
        System.out.println(isHappy(n));
    }
}
