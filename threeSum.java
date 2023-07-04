package DSAsheetByArsh;

import java.util.*;

public class threeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> set = new HashSet<>();
        for(int i = 0; i< nums.length-2; i++){
            HashSet<Integer> s = new HashSet<>();
            for(int j = i+1; j< nums.length; j++){
                int third = -(nums[i]+ nums[j]);
                if(s.contains(third)){
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]); list.add(nums[j]); list.add(third);
                    Collections.sort(list);
                    set.add(list);
                }
                s.add(nums[j]);
            }
        }
        List<List<Integer>> anslist = new ArrayList<>(set);
        return anslist;
    }
}
