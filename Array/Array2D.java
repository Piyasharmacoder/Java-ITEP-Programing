import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter the No of Rows : ");
        int rows = sc.nextInt();
        System.out.print(" Enter the No of colms : ");
        int colms = sc.nextInt();
        System.out.println(" Enter the rows and colms value :");

        // declreation of Array
        int[][] number = new int[rows][colms];
        // intput

        // rows
        for (int i = 0; i < rows; i++) {

            // columns
            for (int j = 0; j < colms; j++) {
                number[i][j] = sc.nextInt();

            }

        }
        // output
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colms; j++) {
                System.out.print(number[i][j] + " ");
            }
            System.out.println();
        }

    }

}
