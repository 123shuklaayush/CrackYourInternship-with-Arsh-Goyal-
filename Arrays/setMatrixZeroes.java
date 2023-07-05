package DSAsheetByArsh;
import java.util.*;
public class setMatrixZeroes {
    public void setZeroes(int[][] matrix) {
        ArrayList<Integer> x = new ArrayList<>();
        ArrayList<Integer> y = new ArrayList<>();
        int n = matrix.length;
        int m = matrix[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    x.add(i);
                    y.add(j);
                }
            }
        }
        for (int i = 0; i < x.size(); i++) {
            int idx = x.get(i);
            for (int j = 0; j < m; j++) {
                matrix[idx][j] = 0;
            }
        }
        for (int i = 0; i < y.size(); i++) {
            int idx = y.get(i);
            for (int j = 0; j < n; j++) {
                matrix[j][idx] = 0;
            }
        }
    }
}
