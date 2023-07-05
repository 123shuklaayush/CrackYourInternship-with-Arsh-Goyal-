package DSAsheetByArsh;

public class containerWithMostWater {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length-1;
        int max =0;
        while( j > i ){
            int lh = height[i];
            int rh = height[j];
            int min = Math.min(lh, rh);
            int w = j-i;
            max = Math.max(min*w, max);
            if(lh > rh) j--;
            else i++;
        }
        return max;
    }
}
