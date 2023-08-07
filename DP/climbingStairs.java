package DSAsheetByArsh.DP;

import java.util.Arrays;

public class climbingStairs {
    static int count = 0;
    public static int climbStairs(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        helper(n, dp);
        return helper(n, dp);
    }
    static int helper(int n, int[] dp){
        if( n <= 0 ){
            if( n == 0 ){
                return 1;
            }
            return 0;
        }
        if(dp[n] != -1) return dp[n];
        return dp[n] = helper(n-1, dp)+ helper(n-2, dp);
    }


    public static void main(String[] args) {
        int n = 3;
        System.out.println(climbStairs(n));
    }
}
