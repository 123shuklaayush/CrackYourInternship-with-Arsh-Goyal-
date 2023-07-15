package DSAsheetByArsh.StacksAndQueues;
import java.util.*;

public class nextGreaterElementI {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] nums3 = NGR(nums2);
        int[] ans = new int[nums1.length];

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums2.length; i++)
            map.put(nums2[i], i);

        for(int i =  0;i < nums1.length; i++){
            if(map.containsKey(nums1[i])){
                ans[i] = nums3[map.get(nums1[i])];
            }
        }
        return ans;
    }
    public static int[] NGR(int[] nums){
        Stack<Integer> st = new Stack<>();
        int[] arr = new int[nums.length];

        for(int i = nums.length-1; i >= 0; i--){
            if(st.isEmpty())
                arr[i] = -1;

            else if(st.peek() > nums[i])
                arr[i] = st.peek();

            else if(st.peek() <= nums[i]){
                while(!st.isEmpty() && st.peek() <= nums[i])
                    st.pop();

                if(st.isEmpty())
                    arr[i] = -1;
                else
                    arr[i] = st.peek();
            }
            st.push(nums[i]);
        }
        return arr;
    }
}
