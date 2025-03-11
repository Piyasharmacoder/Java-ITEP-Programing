package Assignment1;
// Q1. Write a program to check whether a number is a Strong number or not. Strong number is a special number

// whose sum of factorial of digits is equal to the original number. For example: 145 is a strong number. Since, 1! + 4! + 5! = 145

import java.util.Scanner;

public class CheakStrongNumber {

    public static int fac(int n) {

        int f = 1;
        for (int i = 1; i <= n; i++)
            f = f * i;
        return f;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();
        int sum = 0, n1 = n;

        while (n != 0) {
            int d = n % 10;
            sum = sum + fac(d);
            n = n / 10;
        }

        if (sum == n1)
            System.out.println(" this is Strong Number");
        else
            System.out.println("Not a Strong Number");
    }
}
