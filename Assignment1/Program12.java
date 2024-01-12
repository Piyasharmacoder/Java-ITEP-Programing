package Assignment1;
 import java.util.Scanner;
 class Progaram12 {
     public static void main(String[]args){

          boolean a,b,c,d,e,f;
          Scanner in = new Scanner(System.in);
           System.out.print( "Enter the value of x   :");
           int  x =  in.nextInt();
           System.out.print(" Enter the value of y   :");
           int y = in.nextInt(); 
           a=x==y;
           b=x!=y; 
           c=x>y; 
           d=x<y; 
           e=x>=y; 
           f=x<=y; 
           System.out.println("  x   Equle y             : "+a);
           System.out.println("  x  NOT equle y          : "+b);
           System.out.println("  x Greater then y        : "+c);
           System.out.println("  x Smaller then y        : "+d);
           System.out.println("  x Greater equle then y  : "+e);
           System.out.println("  x Smaller equle then y  : "+f);

     }
    
}
