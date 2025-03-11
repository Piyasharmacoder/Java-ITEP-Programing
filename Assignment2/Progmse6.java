import java.util.Scanner;

// 1wap to print all odd number series 1,3,5,7,9--------------n.//
// 2And wap to print sum of serise n 1/1 + 1/3 + 1/5 + 1/7 + 1/9------------------------------------1/n.terms 
// te 1 whlie (n!=0 
public class Progmse6 {

    // public static void main(String args[]) {
    // Scanner Sc = new Scanner(System.in);
    // System.out.print(" Enter the number :");
    // int n = Sc.nextInt();
    // double sum = 0.0;
    // for (int i = 1; i <= n; i++) {
    // if (i % 2 != 0) {
    // sum = sum + 1.0 / i;
    // System.out.print(i + " + ");
    // }
    // }
    // System.out.print(" \nSum of the serise = " + sum);
    // }

    // --------------------------------------------------------------------------------------------//
    // 3) wap to sum of this serise 1+3+5+7+9------------------------------n term.//

    public static void main(String args[]) {
        Scanner Sc = new Scanner(System.in);
        System.out.print(" Enter the number :");
        int n = Sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
                System.out.print(i + " + ");
            }
        }

        System.out.print(" \n\nSum of the serise = " + sum + "\n");
    }

    // ------------------------------------------------------------------------------------------------//
    // type 2

    // public static void main(String args[]) {
    // Scanner sc = new Scanner(System.in);
    // System.out.print(" enter the no: ");
    // int n = sc.nextInt();
    // int i = 1;
    // for (i = 1; i < 2 * n; i = i + 2) {
    // System.out.print(i+",");
    // }

    // }
}
