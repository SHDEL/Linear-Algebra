import java.util.Arrays;

public class Gaussian {
    public static int [] calculated(float [][] matrix){
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                 if (j < i){
                    float compare =matrix[j][j];
                    float current =matrix[i][j];
                    float constant = current/compare;
                    for (int c = 0; c < matrix[i].length; c++) {
                        matrix[i][c] = matrix[i][c] - (constant * matrix[j][c]);
                    }
                 }
            }
        }
        for (float [] i : matrix) {
            System.out.println(Arrays.toString(i));
        }
        int [] a = {1,1,1};
        
        return backwardEliminate(matrix);
    }
    private static int[] backwardEliminate(float [][] matrix){
        int [] result = new int[matrix.length];
        int row = matrix.length-1;
        int col = matrix[0].length-1;
        for (int i = row; i >= 0 ; i--) {
                for (int j = col-1; j > i; j--) {
                    matrix[i][col] -= (matrix[i][j] * (float)result[j]);
                }
                result[i] = Math.round(matrix[i][col] / matrix[i][i]);
        }
        return result ; 
    }
} 