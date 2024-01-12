package Assingment3;

import java.util.Scanner;

public class Daimondprtn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter the number :");
        int n = sc.nextInt();
        int i, j, sp;
        for (i = 1; i <= n; i++)  
        {
            // for space print
            for (sp = n; sp >i ; sp--)                // we can also write   for( sp=1; sp<=i; sp++)
            {
                System.out.print(" ");
            }
            // for print star
            for (j = 1; j <= i; j++)
            {
                System.out.print(" *");
            }
            System.out.println();
        }
        // half part of pyramid----------

            for (i = 1; i <= n; i++)
             {
                for (sp = 1; sp <= i; sp++) 
                {
                    System.out.print(" ");
                }
                for (j = 1; j <= n-i ; j++) 
                {
                    System.out.print(" *");
                }
              System.out.println();

            } 
    }   
}    
