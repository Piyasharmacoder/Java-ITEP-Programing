package FunctionProgram;

import java.util.Scanner;

public class Function1 {
     //creat  functoin 
    public static int calculatesum( int a, int b ){
        int sum = a+b;
        return sum ;
    }
     public static void main( String [] args ){
        Scanner Sc = new Scanner (System .in );
         int a =Sc.nextInt();
         int b =Sc. nextInt();
         // function call
         int sum = calculatesum( a,b);
         System.out.println(" Sum of this number = "+ sum );
     }
    
 }
    

