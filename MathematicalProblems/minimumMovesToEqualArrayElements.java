package DSAsheetByArsh.MathematicalProblems;

public class minimumMovesToEqualArrayElements {
    public int minMoves(int[] nums) {
        int min = Integer.MAX_VALUE;
        for(int i: nums) min = Math.min(min, i);
        int count = 0;
        for(int i : nums) count+= i-min;
        return count;
    }
}
