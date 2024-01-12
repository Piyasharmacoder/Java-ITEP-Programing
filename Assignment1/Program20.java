package Assignment1;
/// odd number 

import java.util.Scanner;

public class Program20 {
    public static void main ( String [] args ){
        Scanner sc = new Scanner ( System.in );
        System.out.print( " enter the no: ");
        int n= sc.nextInt();
        int i ;
      //  while( i<2*n){
         //   System.out.println(i);
         //  i= i+2;}

        for(i=1; i<2*n; i= i+2){
            System.out.println(i);

        }
    }
}