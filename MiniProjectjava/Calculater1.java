package MiniProjectjava;

import java.util.Scanner;

public class Calculater1 {
   public static void main(String[] args) {
      boolean flag = true;
      while (flag) {
         try {
            Scanner Sc = new Scanner(System.in);
            System.out.print(" Enter the  first number :");
            int a = Sc.nextInt();
            System.out.print(" Enter  opreator : ");
            String opreator = Sc.next();
            System.out.print(" Enter the  Second numbre :");
            int b = Sc.nextInt();
            
            int result = 0;

            if (opreator.equals("+") || opreator.equals("-") || opreator.equals("*") 
                 || opreator.equals("/")|| opreator.equals("%")) {

               if (opreator.equals("+")) {
                  result = a + b;
                  System.out.print(" Addition :  ");
               } else if (opreator.equals("-")) {
                  result = a - b;
                  System.out.print(" Substractoin :  ");
               } else if (opreator.equals("*")) {
                  result = a * b;
                  System.out.print(" Multipication : ");
               } else if (opreator.equals("/")) {
                  result = a / b;
                  System.out.print(" Division  : ");
               } else if (opreator.equals("%")) {
                  result = a % b;
                  System.out.print(" Modulus : ");
               }
                System.out.println(a + " " + opreator + " " + b + " = " + result);

               System.out.println("\ncontinue please enter 1 ortherwise 2 ");
               byte c = Sc.nextByte();
               if (c != 1) {
                  flag = false;
               }
              
            } else {

               System.out.println(" invalid opreater  :");
            }

         } catch (Exception e) {
            System.out.println(" invalid input pleas re-enter ");
         }

      }
   }
 }