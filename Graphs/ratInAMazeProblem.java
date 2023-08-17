package DSAsheetByArsh.Graphs;

import java.util.ArrayList;

public class ratInAMazeProblem {
    public static ArrayList<String> findPath(int[][] m, int n) {
        // Your code here
        boolean[][] vis = new boolean[n][n];
        ArrayList<String> arr = new ArrayList<>();
        helper(m, 0, 0, arr, n, n, "", vis);
        return arr;
    }
    public static void helper(int[][] m , int i, int j, ArrayList<String> arr, int row, int col, String str, boolean[][] vis){
        if( i >= row || j >= col ||  i < 0 || j < 0 || vis[i][j] || m[i][j] == 0)
            return;

        if( i == row-1 && j == col-1 ){
            arr.add(str);
            return;
        }

        vis[i][j] = true;
        helper(m, i, j+1, arr, row, col, str+"R", vis);
        helper(m, i+1, j, arr, row, col, str+"D", vis);
        helper(m, i, j-1, arr, row, col, str+"L", vis);
        helper(m, i-1, j, arr, row, col, str+"U", vis);

        vis[i][j] = false;
    }
}
