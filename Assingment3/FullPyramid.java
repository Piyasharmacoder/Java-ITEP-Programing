package Assingment3;

import java.util.Scanner;

public class FullPyramid {
    public static void main( String [] args ){
        Scanner sc=new Scanner ( System .in);
        System.out.print(" Enter the number :");
        int n = sc.nextInt();
        int i,j,sp;
       for ( i=1 ; i<=n;i++ ){
            // for space print
            for( sp=1; sp<=n-i; sp++){
                System.out.print(" ");
            }
            // for print star
            for( j=1; j<=i; j++){
                 System.out.print(" *");
            }
            System.out.println();
        }

    }
}
