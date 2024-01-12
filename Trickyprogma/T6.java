package Trickyprogma;

public class T6 {
    public static void main(String[] args) {
        int i, j, x = 0, y = 1, z;
        for (i = 1; i <= 4; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(x + " ");
                z = x;
                x = y;
                y = y - z;
            }
            System.out.println();
        }
    }

}
