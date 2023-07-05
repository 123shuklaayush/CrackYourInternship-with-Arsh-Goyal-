package DSAsheetByArsh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class chocolateDistributionProblem {
    public static long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        // your code
        Collections.sort(a);
        long min = Integer.MAX_VALUE;
        for(int i = 0; i< n-m+1; i++){
            min = Math.min(a.get(i+m-1) - a.get(i), min);
        }
        return min;
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(17, 83, 59, 25, 38, 63, 25, 1, 37));
        System.out.println(findMinDiff(nums, 9, 9));
    }
}
