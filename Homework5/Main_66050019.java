import java.util.Arrays;
import java.util.Scanner;

public class Main_66050019 {
    public static void main(String[] args) {
        System.out.println("------Gaussian Program------");
        System.out.println("> N is quantity of equation");
        System.out.println("> a is equation in matrix");
        System.out.println("> b is answer of equation");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N = ");
        int n = sc.nextInt();
        float [][] matrix = new float[n][n+1];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (j == matrix[i].length - 1){
                    System.out.print("Enter b" + (i + 1) + " = "); 
                    matrix[i][j] = sc.nextFloat();
                }
                else{
                    System.out.print("Enter a" + (i + 1) + (j + 1) + " = ");
                    matrix[i][j] = sc.nextFloat();
                }
                
            }
        }
        
        int ans[] = Gaussian.calculated(matrix);
        System.out.println(Arrays.toString(ans));
        sc.close();
    }
}