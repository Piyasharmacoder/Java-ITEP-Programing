package ExaptionHandling;

import java.util.Scanner;

public class E2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the dividend : ");
        int dividend = sc.nextInt();
        System.out.print("Enter the divisor  : ");
        int divisor = sc.nextInt();

        try {
            int result = dividend / divisor;
            System.out.println("your answer is " + result);

        } catch (ArithmeticException e) {
            System.out.println("Divisor can't be 0...");

        }
    }

}
