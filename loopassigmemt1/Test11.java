
import java.util.Scanner;
 // WAP to find the largest number any four numbers.

public class Test11 {
    public static void main(String args[]) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter four number : ");
        int a = Sc.nextInt();
        int b = Sc.nextInt();
        int c = Sc.nextInt();
        int d = Sc.nextInt();
        if (a > b) {
            if (a > c) {
                if (a > d)
                    System.out.println("largest number  = " + a);
                else
                    System.out.println(" largest number = " + b);
            } else {
                if (c > d)
                    System.out.println(" largest number =" + c);
                else
                    System.out.println(" largest number = " + d);
            }
        } else {
            if (b < c) {
                if (b > d)
                    System.out.println(" largest number = " + b);
                else
                    System.out.println(" largest number = " + d);
            } else {
                if (c > d)
                    System.out.println(" largest number = " + c);
                else
                    System.out.println(" largest number = " + d);
            }
            System.out.println();
        }
    }
}
