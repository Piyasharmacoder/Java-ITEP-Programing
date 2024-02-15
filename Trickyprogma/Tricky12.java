package Trickyprogma;
// WAP to print Numbers from 1 to 100 without using loop

import java.util.Scanner;

public class Tricky12 {

    public static void printNumber(int num){
        if (num<=100) {
            System.out.print(num+" ");
            printNumber(num +1);
            
        }
    }
    
    public static void main(String[] args) {
        // Scanner sc= new Scanner(System.in );
        // System.out.println(" Enter the number ");
        // int number = sc.nextInt();
        int n=1;
        printNumber(n);

    
    }
}
