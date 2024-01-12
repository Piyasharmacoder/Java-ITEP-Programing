package Assingment3;

public class prten27 {
    public static void main(String[] args) {
        int i, j;
        for (i = 1; i <= 10; i++) {
            for (j = 1; j <= i; j++) {
                if (i == 10|| j == 1 || i == j)
                    System.out.print(j % 2);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

}
