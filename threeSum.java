package DSAsheetByArsh;

import java.util.*;

public class threeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        for(int i: nums) list.add(i);
        for(int i = 0; i< nums.length; i++){
            int sum = nums[i];
            for(int j =i+1; j< nums.length-1; j++){
                sum +=nums[j];
                int num = ~sum +1;
                if(list.contains(num)){
                    ans.add(new ArrayList<>(Arrays.asList(nums[i], nums[j], ~sum+1)));
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int [] num = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(num));
        System.out.println(~-5 +1);
    }
}
