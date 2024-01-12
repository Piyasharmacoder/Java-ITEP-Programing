package Assingment3;
// Half prymind prtten---------------//
import java.util.Scanner;

public class prten8 {
   /*  public static void main(String[] args) {
        int i,j;
        for(i=1; i<=5; i++ ){
            for( j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }*/

    //-------------------------------------------------------------------------------------------------------------------//
     public static  void  main ( String [] args ){
        Scanner sc = new Scanner ( System .in);
        System.out.print(" Enter the number : ");
        int n = sc.nextInt();
        int i,j;
        for ( i=0; i<n; i++ ){
            for ( j=0; j<i+1; j++){
                System.out.print(" Ram ji ");
            }
            System.out.println();
        }

    }
}
