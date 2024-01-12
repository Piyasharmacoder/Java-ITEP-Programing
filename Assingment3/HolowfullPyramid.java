package Assingment3;

import java.util.Scanner;
// Hollow full pyramid prtten-
// type 1,

public class HolowfullPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter the number : ");
        int n = sc.nextInt();
        int i, j, sp;
        for (i = 0; i < n; i++) {
            // for space
            sp = 0;
            for (j = 0; j < ((2 * n) - 1); j++) {
                if (j < n - i - 1) {
                    System.out.print(" ");
                } else if (sp < 2 * i + 1) {
                    if (sp == 0 || sp == 2 * i || i == n - 1)
                        System.out.print("*");
                    else {
                        System.out.print(" ");
                    }
                    sp++;
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}
