package DSAsheetByArsh;

import java.util.Comparator;
import java.util.PriorityQueue;

public class maximumPointsYouCanObtainFromCards {
    public static int maxScore(int[] cardPoints, int k) {
        PriorityQueue<Integer> p = new PriorityQueue<>(Comparator.reverseOrder());
        for(int i = 0; i<k ; i++){
            p.add(cardPoints[i]);
        }
        for(int i = cardPoints.length-1; i>k; i--){
            p.add(cardPoints[i]);
        }
        int max = 0;
        for(int i = 0; i< k; i++){
            if(!p.isEmpty())
             max+=p.peek();
            p.poll();
        }
        return max;
    }

    public static void main(String[] args) {
        PriorityQueue<Integer> pq= new PriorityQueue<>(Comparator.reverseOrder());
        int[] nums= {1,2,3,4,5,6,1};

        System.out.println(maxScore(nums, 3));
    }
}
