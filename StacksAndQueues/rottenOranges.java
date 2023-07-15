package DSAsheetByArsh.StacksAndQueues;

import java.util.*;

public class rottenOranges {
   static class Pair {
        int first;
        int second;

        Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }
    //Function to find minimum time required to rot all oranges.
    public static int orangesRotting(int[][] grid)
    {
        int n = grid.length;
        int m = grid[0].length;
        Queue<Pair> q = new LinkedList<>();
        int[] delrow = {1, -1, 0, 0};
        int[] delcol = {0, 0, 1, -1};
        int t = -1;
        int s = 0;
        int[][] vis = new int[n][m];

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < m; col++) {
                s += grid[row][col];
                // Copy grid to vis
                vis[row][col] = grid[row][col];
                // Push the rotten orange {row, col} to the queue
                if (grid[row][col] == 2) {
                    q.add(new Pair(row, col));
                }
            }
        }

        // Trivial check: if there are no fruits at all
        if (s == 0) {
            return 0;
        }

        while (!q.isEmpty()) {
            // Take the size of the queue to track the level of BFS traversal
            int sz = q.size();
            while (sz > 0) {
                Pair pair = q.poll();
                int row = pair.first;
                int col = pair.second;

                for (int i = 0; i < 4; i++) {
                    int nrow = row + delrow[i];
                    int ncol = col + delcol[i];
                    if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && vis[nrow][ncol] == 1) {
                        vis[nrow][ncol] = 2;
                        q.add(new Pair(nrow, ncol));
                    }
                }

                sz--;
            }

            t++;
        }

        return t;
    }

    public static void main(String[] args) {
        int[][] grid =  {{0,1,2},
                        {0,1,2},
                        {2,1,1}};
        System.out.println(orangesRotting(grid));
    }
}