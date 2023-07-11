package DSAsheetByArsh.Arrays;

import java.util.Arrays;

public class mergeSortedArray {
    public static void merge(int[] A, int m, int[] B, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (i >= 0 && j >= 0) {
            if (A[i] > B[j]) {
                A[k] = A[i];
                k--;
                i--;
            } else {
                A[k] = B[j];
                k--;
                j--;
            }
        }

        while (j >= 0) {
            A[k--] = B[j--];
        }
    }

    public static void main(String[] args) {
        int[] a = {0};
        int[] b = {1};
        merge(a, 0, b, 1);
        System.out.println(Arrays.toString(a));
    }
}
