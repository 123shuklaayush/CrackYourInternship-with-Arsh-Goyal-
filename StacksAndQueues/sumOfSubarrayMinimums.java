package DSAsheetByArsh.StacksAndQueues;

import java.util.Stack;

public class sumOfSubarrayMinimums {
    public int sumSubarrayMins(int[] arr) {
        int mod = 1000000007;
        int n = arr.length;
        int[] left = new int[n];
        int[] right = new int[n];
        Stack<Integer> stack = new Stack<>();

        // Calculate the count of elements to the left of the current element that are greater than or equal to it
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
                stack.pop();
            }
            left[i] = stack.isEmpty() ? i + 1 : i - stack.peek();
            stack.push(i);
        }

        stack.clear(); // Clear the stack for the next iteration

        // Calculate the count of elements to the right of the current element that are greater than it
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            right[i] = stack.isEmpty() ? n - i : stack.peek() - i;
            stack.push(i);
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            int product = (int) ((long) arr[i] * left[i] % mod * right[i] % mod);
            sum = (sum + product) % mod;
        }

        return sum;
    }
}
