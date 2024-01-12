package Assingment3;

import java.util.Scanner;

public class SuqPerten {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter the number: ");
        int n = sc.nextInt();
        int i, j;
        // outer loop
        for (i = 0; i < n; i++) {
            //inner loop
            for (j = 0; j < n; j++) {
                System.out.print(" *");
            }
            System.out.println();
         }

    }
}
