package Trickyprogma;

import java.util.Scanner;

public class T10triky {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in );
        System.out.print(" Enter the number : ");
        int n = Sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int k = n; k >= i; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j % 2);
            }
            System.out.println();
        }
    
}
    
    
}
