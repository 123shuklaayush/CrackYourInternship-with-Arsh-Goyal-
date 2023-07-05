package DSAsheetByArsh;
import java.util.*;
public class findTheDuplicateNumber {
    public static int findDuplicate(int[] nums) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        int count=0;

        for(int i = 0; i< nums.length; i++){
            if(mp.containsKey(nums[i])){
                mp.put(nums[i], mp.get(nums[i])+1);
                return nums[i];
            }
            else{
                mp.put(nums[i], 1);
            }
        }
        return nums[0];
    }
}
