package DSAsheetByArsh;

import java.util.Arrays;
import java.util.*;

public class twoSum {
    public static int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(target - numbers[i])) {
                result[1] = i;
                int res = target - numbers[i];
                int ans = map.get(res);
                result[0] = map.get(target - numbers[i]);
                return result;
            }
            map.put(numbers[i], i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr= {7,5,3,1,8,10};
        System.out.println(Arrays.toString(twoSum(arr, 9)));
    }
}
