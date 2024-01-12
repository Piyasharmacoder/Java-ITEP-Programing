package Assingment3;

import java.util.Scanner;

public class NumericalPrten1 {
     public  static void main ( String [] args )
     {
        Scanner Sc  = new Scanner( System .in );
        System.out.print("\n Enter the number : ");
        int k = Sc.nextInt();
        int i,j;
        for( i=1 ; i<=5; i++){
            for( j =1; j<=5; j++){
                System.out.print(k);
            }
            System.out.println();
        }
     }
    
}
