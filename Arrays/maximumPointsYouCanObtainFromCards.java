package DSAsheetByArsh;

import java.util.Comparator;
import java.util.PriorityQueue;

public class maximumPointsYouCanObtainFromCards {
    public static int maxScore(int[] cardPoints, int k) {
            int n = cardPoints.length;
            int[] left = new int[n + 1];
            int[] right = new int[n + 1];
            for (int i = 0; i < n; i++) {
                left[i + 1] = left[i] + cardPoints[i];
                right[i + 1] = cardPoints[n - i - 1] + right[i];
            }
            int max = 0;
            for (int i = 0; i <= k; i++) {
                int currSum = left[i] + right[k - i];
                max = Math.max(currSum, max);
            }
            return max;
        }
    public static void main(String[] args) {
        PriorityQueue<Integer> pq= new PriorityQueue<>(Comparator.reverseOrder());
        int[] nums= {1,2,3,4,5,6,1};
        System.out.println(maxScore(nums, 3));
    }
}
