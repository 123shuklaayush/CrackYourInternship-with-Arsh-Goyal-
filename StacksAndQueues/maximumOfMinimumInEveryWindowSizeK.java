package DSAsheetByArsh.StacksAndQueues;

import java.util.Arrays;
import java.util.Stack;

public class maximumOfMinimumInEveryWindowSizeK {
    static int[] maxOfMin(int[] arr, int n) {
        int[] nsl = NSL(arr);
        int[] nsr = NSR(arr);
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            int num = nsr[i] - (nsl[i] + 1);
            int t = ans[num-1];
            int q = arr[i];
            ans[num - 1] = Math.max(t, q);
        }
        for (int i = n - 2; i >= 0; i--) {
            if (ans[i] < ans[i + 1])
                ans[i] = ans[i + 1];
        }
        return ans;
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
        int arr[] = {10,20,30,50,10,70,30};
        int n = 7;
        System.out.println(Arrays.toString(maxOfMin(arr, n)));

    }
}
