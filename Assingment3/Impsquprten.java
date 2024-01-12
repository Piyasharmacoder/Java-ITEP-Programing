package Assingment3;

public class Impsquprten {
    public static void main(String[] args) {
        int i, j;
        for (i = 1; i <= 11; i++) {
            for (j = 1; j <= 11; j++) {
                if (i == 1 || i == 11 || j == 1 || j == 11 || i == j || i + j == 12) {
                    System.out.print("*");
                } else {
                    System.out.print( " ");

                }
            }
               System.out.println();
        }
    }
}