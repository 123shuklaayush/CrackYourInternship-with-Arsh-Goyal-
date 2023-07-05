package DSAsheetByArsh;

import java.util.*;

public class fourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> arr = new HashSet<>();
        for(int i = 0; i< nums.length-3; i++){
            for(int j = i+1; j< nums.length-2; j++){
                HashSet<Integer> set = new HashSet<>();

                for(int k = j+1; k< nums.length-1; k++){
                    int sum = nums[i];
                    sum+= nums[j];
                    sum+= nums[k];
                    int fourth = target-sum;
                    if(set.contains(fourth)){
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]); list.add(nums[j]); list.add(nums[k]);
                        list.add(fourth);
                        Collections.sort(list);
                    }
                    set.add(nums[k]);
                }
            }
        }
        List<List<Integer>> ans = new ArrayList<>(arr);
        return ans;
    }

}
