package DSAsheetByArsh.String;

import java.util.*;

public class distinctSubsequences {
    public static int numDistinct(String s, String t) {
        int n = s.length(), m = t.length();
        int[][] dp = new int[n+1][m+1];
        for(int[] ints: dp) Arrays.fill(ints, -1);
        int i =0, j=0;
        return countDistinct(s, t, i, j, dp);
    }
    public static int countDistinct(String s, String t, int i, int j, int [][] dp) {
        if (j == t.length())
            return 1;

        if (i == s.length())
            return 0;
        if (dp[i][j] != -1)
            return dp[i][j];
        int count = 0;
        if (s.charAt(i) == t.charAt(j)) {
            count += countDistinct(s, t, i + 1, j + 1, dp);
        }
        count += countDistinct(s, t, i + 1, j, dp);

        dp[i][j] = count;
        return count;
    }


    public static void main(String[] args) {
        String s  = "rabbbit";
        String t = "rabbit";
        System.out.println(numDistinct(s, t));
    }
}
