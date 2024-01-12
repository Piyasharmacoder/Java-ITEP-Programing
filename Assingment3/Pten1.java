package Assingment3;

public class Pten1 {

  /*  public static void main(String[] agrs) {
        int n = 5;
        int i, j;
        for (i = 5; i >= 1; i--) {
            for (j = 1; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }*/

//-------------------------------------------------------------------


public static void main(String[] agrs) {
    int n = 10;
    int i, j;
    for (i = 1; i<= n; i++) {
        for (j = n; j >= i; j--) {
            System.out.print(" *");
           }
           System.out.println();
        }
    }

}
