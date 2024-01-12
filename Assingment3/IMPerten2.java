package Assingment3;

public class IMPerten2 {
    public static void main(String args[]) {
        int i, j;
        for (i = 1; i <= 11; i++) {
            for (j = 1; j <= 11; j++) {
                if (i == 1 || j == 1 || i == 11 || j == 11 || i == 6 || j == 6 || i==3&&j==3|| i==3&&j==9||i==9&&j==3||i==9&&j==9) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
               System.out.println();
        }
    }
}
