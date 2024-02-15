package Assingment3;

class newpertten {
    public void oppositnumberptr(int i, int j, int k) {

        for (i = 5; i >= 0; i--) {
            for (k = 0; k <= i; k++) {
                System.out.print("  ");
            }
            for (j = i; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
}

public class prten3 {
    public static void main(String[] args) {
        int i, j, k;
        for (i = 0; i <= 5; i++) {
            for (k = 0; k <= i; k++) {
                System.out.print("  ");
            }
            for (j = 0; j <= 0; j++) {
                System.out.print(" * ");
            }
            System.out.println();

        }

        newpertten obj = new newpertten();
        obj.oppositnumberptr(5, 5, 0);
    }
}