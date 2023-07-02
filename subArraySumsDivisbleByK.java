package DSAsheetByArsh;
import java.util.*;
public class subArraySumsDivisbleByK {
    public static ArrayList<ArrayList<Integer>> subsets(int[] nums){
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for(int i: nums) arr.add(i);
        int idx = arr.size();
        helper(arr, idx, list, new ArrayList<>());
        return list;
    }

    private static void helper(ArrayList<Integer> arr, int idx, ArrayList<ArrayList<Integer>> list, ArrayList<Integer> op) {
        if(idx == 0){
            list.add(new ArrayList<>(op));
            return;
        }

        op.add(arr.get(idx-1));
        helper(arr, idx-1, list, op); // Include the current element
        op.remove(op.size()-1);

        helper(arr, idx-1, list, op); // Exclude the current element
    }
    public static int subarraysDivByK(int[] nums, int k) {
        ArrayList<ArrayList<Integer>> arr = subsets(nums);
        int size =0;
        for(int i = 0; i< arr.size(); i++){
            int sum = 0;
            for(int j = 0; j< arr.get(i).size(); j++){
                sum += arr.get(i).get(j);
            }
            if(sum % k == 0) size++;
        }
        return size;
    }
    public static void main(String[] args) {
        int[] nums = {4,5,0,-2,-3,1};
        int k = 5;
        ArrayList<ArrayList<Integer>> subsets = subsets(nums);
        System.out.println(subarraysDivByK(nums, k));
    }
}
