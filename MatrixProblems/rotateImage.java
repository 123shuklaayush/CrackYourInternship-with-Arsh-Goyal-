package DSAsheetByArsh.MatrixProblems;

import java.util.ArrayList;
import java.util.Arrays;

public class rotateImage {
    public static void rotate(int[][] matrix) {
        ArrayList<Integer> arr = new ArrayList<>();
        int row = matrix.length-1;
        int cols = matrix[0].length-1;
        for(int i = 0; i <= row; i++){
            for(int j = row; j>=0; j--){
                int element = matrix[j][i];
                arr.add(matrix[j][i]);
            }
        }
        int m = 0;
        for(int i = 0; i<= row; i++){
            for(int j = 0; j<= cols; j++){
                matrix[i][j] = arr.get(m++);
            }
        }
    }
}
