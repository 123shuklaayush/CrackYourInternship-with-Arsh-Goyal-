package DSAsheetByArsh.DP;

import java.util.Arrays;

public class onesAndZeroes {
    public static int findMaxForm(String[] strs, int m, int n) {
        int[][] dp = new int[m + 1][n + 1];
        for(int k = 0; k< strs.length; k++){
            int[] count= count(strs[k]);
            for(int i = m ; i >= count[0]; i--){
                for(int j = n; j >= count[1]; j--){
                    dp[i][j] = Math.max(dp[i][j], 1 + dp[i-count[0]][j-count[1]]);
                }
            }
        }
        return dp[m][n];

    }

    public static int[] count( String str ){
        int[] ans = new int[2];
        for(int i = 0; i< str.length(); i++){
            if(str.charAt(i) == '0'){
                ans[0]++;
            }
            if(str.charAt(i) == '1'){
                ans[1]++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String[] str = {"10","0001","111001","1","0"};
        int m = 5;
        int n = 3;
        System.out.println(findMaxForm(str, m, n));
    }
}
