package DSAsheetByArsh;

import java.util.HashMap;

public class subArraySumsEqualsK {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        int prefixSum = 0;

        for(int i = 0; i< nums.length; i++){
            prefixSum += nums[i];
            if(prefixSum == k) count++;
            if(map.containsKey(prefixSum-k)){
                map.put(nums[i], map.get(nums[i]) +1);
                count++;
            }
            else
                map.put(nums[i], 1);
        }
        return count;
    }
}
