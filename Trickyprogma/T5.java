package Trickyprogma;

public class T5 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i <= n-1; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= n - 1 - i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
