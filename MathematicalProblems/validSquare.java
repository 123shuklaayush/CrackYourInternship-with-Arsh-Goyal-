package DSAsheetByArsh.MathematicalProblems;

import java.util.Arrays;
import java.util.HashSet;

public class validSquare {
    public static boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        HashSet<Integer> set = new HashSet<>(Arrays.asList(
        takeDistance(p1, p2),
        takeDistance(p1, p3),
        takeDistance(p1, p4),
        takeDistance(p2, p3),
        takeDistance(p2, p4),
        takeDistance(p3, p4)
        ));
        return !set.contains(0) && set.size() ==2;
    }
    public static int takeDistance(int[] a, int[] b){
        return (a[0]-b[0])*(a[0]-b[0]) + (a[1]-b[1])*(a[1]-b[1]);
    }

    public static void main(String[] args) {
        int[] p1 = {0, 0};
        int[] p2 = {1, 1};
        int[] p3 = {1, 0};
        int[] p4 = {0, 1};
        System.out.println(validSquare(p1, p2, p3, p4));

    }

}
