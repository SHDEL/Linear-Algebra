/**
 * Matrix
 */
import java.util.Arrays;
public class Matrix {
    private int matrix [][];
    private int m;
    private int n;
    private int det;

    public Matrix(int row, int column){
        this.m = row;
        this.n = column;
        matrix = new int[row][column];
        det = 0;
        System.out.println("Set Matrix Completed m: " + this.m + " n: " + this.n);
    }
    public void setMatrix(int [][] data){
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){
                matrix[i][j] = data[i][j];
            }
        }
        // check matrix
        System.out.println("Your Matrix A: ");
        for (int [] e : matrix){
            System.out.println(Arrays.toString(e));
        }
    }
    public int determinant(int matrix [][] ,int n){
        det = 0;
        // int cofac = 0;
        
        if ((n == 2)){
            return (matrix[0][0] * matrix[1][1]) - (matrix[0][1] * matrix[1][0]);
        }
        int tmpe = 0;
        int tmpij = 0;
        int submatrix [][] = new int[n - 1][n - 1];
        for (int k = 0; k < n; k++){
            tmpe = matrix[0][k];
            tmpij = 1 + (k + 1);
            for (int i = 1; i < n; i++){
                int col = 0;
                for (int j = 0; j < n; j++){
                    
                    if (j == k){
                        continue;
                    }
                    submatrix[i - 1][col] = matrix[i][j];
                    col++;
                }
            }
            for (int [] a : submatrix){
                System.out.println(Arrays.toString(a));
            }
            System.out.println("tmpe: " + tmpe + " * " + (Math.pow(-1, tmpij)));
            
            det += (tmpe * (Math.pow(-1, tmpij)) * determinant(submatrix, n - 1));
        }
        System.out.println("------Answer------");
        return det;
    }
}