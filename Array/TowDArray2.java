import java.util.Scanner;

//  Q .search element in given matrix 
// x= element value 
public class TowDArray2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of rows : ");
        int rows = sc.nextInt();
        System.out.print("Enter the no of colms : ");
        int colms = sc.nextInt();
        System.out.println("Enter the rows and colms value : ");
        // decleration of Array
        int[][] matrix = new int[rows][colms];
        // input
        // rows
        for (int i = 0; i < rows; i++) {
            // coloms
            for (int j = 0; j < colms; j++) {
                matrix[i][j] = sc.nextInt();

            }
        } 
        System.out.println(" Enter the value of  X : ");
        int X = sc.nextInt();
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colms; j++) {
                // now compair with X
                if (matrix[i][j] == X) {
                    System.out.print(" X found at location (" + i + "," + j + ") ");
                } 
            }

            
            System.out.println();
        }

    }
}
