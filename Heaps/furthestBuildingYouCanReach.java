package DSAsheetByArsh.Heaps;

import java.util.*;

public class furthestBuildingYouCanReach {
    public static int furthestBuilding(int[] heights, int bricks, int ladders) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i = 0; i< heights.length-1; i++){
            int diff = heights[i+1]-heights[i];
            if(diff > 0){
                pq.add(diff);
            }
            if ( pq.size() > ladders ){
                bricks -= pq.poll();
            }
            if(bricks < 0 ) return i;
        }
        return heights.length-1;
    }

    public static void main(String[] args) {
        int[] arr = {1,5,1,2,3,4,10000};
        System.out.println(furthestBuilding(arr, 4, 1));
    }

}
