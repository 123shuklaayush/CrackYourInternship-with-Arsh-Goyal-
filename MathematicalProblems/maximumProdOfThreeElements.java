package DSAsheetByArsh.MathematicalProblems;

import java.util.Comparator;
import java.util.*;

public class maximumProdOfThreeElements {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        return Math.max(nums[nums.length-1]* nums[nums.length-2]* nums[nums.length-3], nums[0]*nums[1]* nums[nums.length-1]);
    }
}
