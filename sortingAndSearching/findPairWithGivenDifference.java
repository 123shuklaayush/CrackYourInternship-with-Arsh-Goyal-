package DSAsheetByArsh.sortingAndSearching;

import java.util.*;

public class findPairWithGivenDifference {
    public static boolean findPair(int arr[], int size, int n)
    {
        //code here.
        Arrays.sort(arr);
        int i = 0, j= 1;
        while( i < size && j < size ){
            int diff = arr[j]-arr[i];
            if(diff == n) return true;
            else if( diff < n)
                j++;
            else i++;
            if(i == j) j++;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {90, 70, 20, 80, 50};
        int size = nums.length;
        System.out.println(findPair(nums, size, 45));
    }
}
