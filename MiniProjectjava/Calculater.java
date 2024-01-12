package MiniProjectjava;

import java.util.Scanner;

public class Calculater {

   public static void main(String[] args) {
      Scanner Sc = new Scanner(System.in);
      System.out.print(" Enter the  first number :");
      int a = Sc.nextInt();
      System.out.print(" Enter the  Second numbre :");
      int b = Sc.nextInt();
      System.out.print(" select opreator +, -,/,*,% : ");
      String opreator = Sc.next();
      int result = 0;

      if (opreator.equals("+") || opreator.equals("-") || opreator.equals("*") 
            || opreator.equals("/")
            || opreator.equals("%")){
               if( opreator.equals("+")){
                  result = a+b;
                  System.out.println(" Add :");
               }  
               if( opreator.equals("-")){
                  result = a-b;
                  System.out.println("Sub : ");
               } 
               if( opreator.equals("*")){
                  result = a*b;
                  System.out.println(" mul ");
               }
               if( opreator.equals("/")){
                  result = a/b;
                  System.out.println("Divide of  ");
               } if( opreator.equals("%")){
                  result= a%b;
                  System.out.println(" modulus of ");
               } 
      
            }

      else
      {
       System.out.println( " invalid  opreator ");

      }
      System.out.println( "result " + a+ " "+ opreator+ " "+ b+ " " +"= "+ result) ;  
   } 
}
          