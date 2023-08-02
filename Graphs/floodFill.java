package DSAsheetByArsh.Graphs;

public class floodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(color == image[sr][sc]) return image;
        int rows = image.length;
        int cols = image[0].length;
        int source = image[sr][sc];
        dfsFill(image, sr, sc, color, rows, cols, source);
        return image;
    }
    void dfsFill(int[][] image, int sr, int sc, int color, int row, int col, int src){
        if(sr < 0 || sr >= row || sc < 0 || sc >= col){
            return;
        }
        else if(image[sr][sc] != src) return;

        image[sr][sc] = color;
        dfsFill(image, sr+1, sc, color, row, col, src);
        dfsFill(image, sr-1, sc, color, row, col, src);
        dfsFill(image, sr, sc-1, color, row, col, src);
        dfsFill(image, sr, sc+1, color, row, col, src);
    }
}
