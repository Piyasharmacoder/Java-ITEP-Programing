package Assingment3;

public class prten39 {
    public static void main(String[] args) {
        int i, j;
        int r = 1;
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= r; j++) {
                System.out.print("*");
            }
            System.out.println();
            r = r + i;
        }
    }
}
