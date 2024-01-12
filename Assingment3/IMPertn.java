package Assingment3;

public class IMPertn {
    public static void main(String[] args) {
        int i, j;
        for (i = 1; i <= 11; i++) {
            for (j = 1; j <= 11; j++) {
                if (i == 1 || j == 1 || i == 11 || j == 11 || i + j == 7 || j - i == 5 | i + j == 17 || i - j == 5|| i==6&&j==6) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }

}
