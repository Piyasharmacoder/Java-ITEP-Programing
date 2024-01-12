 package Swtichcasecondition;

import java.util.Scanner;

class Swtich1{
    public static void main ( String []args ){
        int  a,b,ch;
        Scanner sc = new Scanner( System.in );
        System.out.print( "Enter the first number: ");
         a = sc.nextInt();
         System.out.print("Enter the second number: ");
         b =sc.nextInt();
         System.out.print("1->Add,2->sub,3->mul, 4-> div, Enter your choose: ");
         ch=sc.nextInt();
         switch(ch) 
         {
          case 1:
               System.out.println(" Add ="+ (a+b));
          break;
          case 2:
               System.out.println(" sub ="+ (a-b));
          break;
          case 3:
               System.out.println(" mul ="+ (a*b));
          break;
          case 4:
               System.out.println(" div ="+ (a/b));
          break;
          default:
               System.out.println(" 'Invalid choice'  plase inter valid number ");  
               break;
         } 
         }
          
    }
