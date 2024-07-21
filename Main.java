import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        // setup row and column
        System.out.println("----Find Determinant of Matrix Program----");
        System.out.println("Please enter the square matrix (m = n)");
        System.out.print("Enter m (row): ");
        int row = sc.nextInt();
        System.out.print("Enter n (column): ");
        int column = sc.nextInt();
        if (row != column){
            System.out.println("Row and Column must be equal");
            return;
        }
        Matrix a = new Matrix(row, column);
        //set element
        int [][] data = setElement(row, column);
        // //print to check element
        // for(int i = 0; i < data.length; i++){
        //     System.out.println(Arrays.toString(data[i]));
        // }
        //set to matrix
        a.setMatrix(data);
        System.out.println("-----Find det(A)-----");
        System.out.println("det(A): " + a.determinant(data, column));
    }
    public static int [][] setElement(int m, int n){
        int data [][] = new int[m][n];
        System.out.println("Enter number each element");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Enter element a" + (i + 1) + (j + 1) + ": ");
                data[i][j] = sc.nextInt();
            }
        }
        return data;
    }
}
