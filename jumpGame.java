package DSAsheetByArsh;

import java.util.Arrays;

public class jumpGame {
    public static boolean canJump(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, -1);
        return helper(nums, 0, dp);
    }

    public static boolean helper(int[] nums, int idx, int[] dp) {
        if (idx == nums.length - 1) return true;
        if (nums[idx] == 0) return false;
        if (dp[idx] != -1) return dp[idx] == 1;

        for (int i = 1; i <= nums[idx] && i + idx < nums.length; i++) {
            if (helper(nums, idx + i, dp)) {
                dp[idx] = 1;
                return true;
            }
        }
        dp[idx] = 0;
        return false;
    }


    public static void main(String[] args) {
        int[] nums = {2,3,1,0,4};
        System.out.println(canJump(nums));
    }
}
