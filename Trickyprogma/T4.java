package Trickyprogma;

public class T4 {
    public static void main(String[] args) {
        int i, j;
        int k, p;
        for (i = 5; i >= 1; i--) {
            for (k = i + 1 - 5, p = 5; k <= 5; k++) {
                if (k < i)
                    System.out.print(p-- + " ");
                else
                    System.out.print(p++ + " ");
            }
            System.out.println();
        }
    }

}
