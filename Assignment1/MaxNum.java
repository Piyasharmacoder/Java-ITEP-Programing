package Assignment1;
//Q2. Write a program to input two numbers and find the maximum between two numbers using the conditional/ternary operator.

import java.util.Scanner;

public class MaxNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = sc.nextInt();

        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        // using ternary operator
        int max = (a > b) ? a : b;

        // Display result
        System.out.println("The maximum number is: " + max);
    }
}
