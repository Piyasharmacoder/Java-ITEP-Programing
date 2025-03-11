/*Ques.-: 1 .Take 20 integer inputs from user and print the following:
number of positive numbers
number of negative numbers
number of odd numbers
number of even numbers
number of 0s.*/
import java.util.Scanner;

public class A1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[20];
        System.out.println("Enter 20 integer value : ");
        for (int i = 0; i < 20; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("positive number : ");
        for (int i = 0; i < 20; i++) {
            if (a[i] > 0) 
                System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.print("negative number : ");
        for (int i = 0; i < 20; i++) {
            if (a[i] < 0)
                System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.print("odd number :- ");
        for (int i = 0; i < 20; i++) {
            if (a[i] % 2 == 1)
                System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.print("even number :- ");
        for (int i = 0; i < 20; i++) {
            if (a[i] % 2 == 0)
                System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.print("0s number : ");
        for (int i = 0; i < 20; i++) {
            if (a[i] == 0)
                System.out.print(a[i] + " ");
        }
    }

}
