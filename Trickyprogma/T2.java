package Trickyprogma;

import java.util.Scanner;

public class T2 {
    public static void main(String[] args) {
        Scanner Sc =new Scanner ( System.in);
        System.out.println(" Enter any two the number ");
        int n =Sc.nextInt();
        int m =Sc.nextInt();
        int p =Sc.nextInt();
                System.out.println("\t");

        int i, j, k;
        for (i = 1, j = 1,k=1; i <= 10; i++, j++, k++) {
            System.out.println(  n*i + "\t" + m*j + " \t" + p*k);
       }
    }
}
