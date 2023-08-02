package DSAsheetByArsh.Graphs;

import java.util.ArrayList;

public class ratInAMazeProblem {

    public static ArrayList<String> findPath(int[][] m, int n) {
        // Your code here
        int src = m[0][0];
        ArrayList<String> arr = new ArrayList<>();
        int dest = m[m.length-1][m[0].length-1];
        if(src != 1 || dest != 1){
            arr.add("-1");
            return arr;
        }
        checkForPath(0, 0, m, m.length, m[0].length, arr);
        return arr;
    }
    static void checkForPath(int i, int j, int[][] matrix, int row, int cols, ArrayList<String> arr){
        if( i >= row || i < 0 || j < 0 || j >= cols)
            return;
        if(matrix[i][j] ==1){

        }
    }
}
