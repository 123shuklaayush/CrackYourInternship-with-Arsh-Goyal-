package DSAsheetByArsh.Heaps;

public class uglyNumberII {
    public static int nthUglyNumber(int n) {
        int[] dp = new int[n+1];
        dp[0] = 1;
        int ptr2 = 0;
        int ptr3 = 0;
        int ptr5 = 0;

        for(int i = 1; i<= n; i++){
            int two  = dp[ptr2] * 2;
            int three = dp[ptr3] * 3;
            int five = dp[ptr5] * 5;
            dp[i] = Math.min(two, Math.min(three, five));
            if(dp[i] == two) ptr2++;
            if(dp[i] == three) ptr3++;
            if(dp[i] == five) ptr5++;
        }
        return dp[n-1];
    }
}
