package DSAsheetByArsh.DP;

public class maxProductSubarray {
    public  static int maxProduct(int[] nums) {
        int ans = Integer.MIN_VALUE;
        int pre = 1, suf = 1;
        for(int i = 0; i < nums.length; i++){
            if(pre == 0) pre = 1;
            if(suf == 0) suf = 1;

            pre = pre * nums[i];
            suf = suf* nums[nums.length-1-i];
            ans = Math.max(ans, Math.max(pre, suf));
        }
        return ans;
    }


    public static void main(String[] args) {
        int[] arr = {2,3,-2,4};
        System.out.println(maxProduct(arr));
    }
}
