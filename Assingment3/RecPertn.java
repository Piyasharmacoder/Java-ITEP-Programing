package Assingment3;

import java.util.Scanner;

public class RecPertn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter the no fo row  : ");
        int n = sc.nextInt();
        System.out.print(" Enter the no of colum : ");
        int m = sc.nextInt();
        int i,j;
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }

    }
}