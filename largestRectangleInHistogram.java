package DSAsheetByArsh;

import java.util.*;

public class largestRectangleInHistogram {
    public int largestRectangleArea(int[] heights) {
        int[] ps = NSL(heights);
        int[] ns = NSR(heights);
        int[] temp = new int[heights.length];
        for(int i = 0; i< heights.length; i++){
            temp[i] = ns[i] -ps[i] -1;
        }
        int max = 0;
        for(int i = 0; i< heights.length; i++){
            max = Math.max(max, heights[i]*temp[i]);
        }
        return max;
    }
    public static int[] NSL(int[] nums){
        Stack<Integer> st = new Stack<>();
        int[] arr = new int[nums.length];
        for(int i = 0; i< nums.length; i++){
            while(!st.isEmpty() && nums[st.peek()] >= nums[i])
                st.pop();
            if(st.isEmpty())
                arr[i] = -1;
            else
                arr[i] = st.peek();
            st.push(i);
        }
        return arr;
    }
    public static int[] NSR(int[] nums){
        Stack<Integer> st = new Stack<>();
        int[] arr= new int[nums.length];
        for(int i = nums.length-1; i>= 0; i--) {
            while(!st.isEmpty() && nums[st.peek()] >= nums[i])
                st.pop();
            if(st.isEmpty())
                arr[i] = nums.length;
            else
                arr[i] = st.peek();
            st.push(i);
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] nums = {4,2,1,5,6,3,2,4,2};
        System.out.println((Arrays.toString(NSR(nums))));
        System.out.println((Arrays.toString(NSL(nums))));
    }
}
