public class Arraj20 {
    // Q3 .add two matrix array
    public static void main(String[] args) {
        int[][] matrix1 = { { 1, 3, 6 },
                              { 2, 4, 8 } };
        int[][] matrix2 = { { 9, 8, 3 },
                            { 5, 6, 7 } };
        int sum[][] = { { 0, 0, 0 },
                        { 0, 0, 0 } };
        for (int i = 0; i < matrix1.length; i++) { // row numberof time
            for (int j = 0; j < matrix1[i].length; j++) { // colm number of time
                System.out.format("Seting value for i =%d and j = %d\n", i, j);
                sum[i][j] = matrix1[i][j] + matrix2[i][j];

            }
        }
        System.out.println("\nSum of matrix : ");
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                System.out.print(sum[i][j] + " ");
                sum[i][j] = matrix1[i][j] + matrix2[i][j];

            }
            System.out.println();
        }

    }

}
