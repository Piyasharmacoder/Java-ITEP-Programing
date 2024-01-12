package Basicprogram.operators.Airthmetical;

import java.util.Scanner;

class Airthmetic {
     public static void main(String[]args){   
      /*take input to users */    
      Scanner sc = new Scanner(System .in);
      System.out.print (" Enter 1num: ");
       int a =sc.nextInt();
       System.out.print(" Enter 2num: ");
       int b= sc.nextInt();
       System.out.println("Addition:"+ (a+b) ); 

       System.out.println("Substraction: "+ (a-b) );

       System.out.println("division:"+ (a/b) );

       System.out.println("Multiplication:"+( a*b ));
       
       System.out.println("Modulus:"+ (a%b) );
     }
}
