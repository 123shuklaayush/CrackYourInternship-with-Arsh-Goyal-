package DSAsheetByArsh.Graphs;

public class numberOfIsland {
    public int numIslands(char[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int ans = 0;
        if(grid.length == 0) return 0;
        for(int i = 0; i< grid.length; i++){
            for(int j = 0; j< grid[i].length; j++){
                if(grid[i][j] == 1){
                    markBfs(i, j, grid, row, col);
                    ans++;
                }
            }
        }
        return ans;
    }
    void markBfs(int i, int j, char[][] grid, int row, int col){
        if( i < 0 || i >= row || j < 0 || j >= col || grid[i][j] != '1'){
            return;
        }
        grid[i][j] = '2';

        markBfs(i+1, j, grid, row, col);
        markBfs(i-1, j, grid, row, col);
        markBfs(i, j+1, grid, row, col);
        markBfs(i, j-1, grid, row, col);
    }
}
