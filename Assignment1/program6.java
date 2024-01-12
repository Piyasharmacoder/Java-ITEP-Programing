
package Assignment1;
import java.util.Scanner;

class program6 {
    public static void main(String []args ){
        Scanner in = new Scanner(System.in);
   
        System.out.print("Input first number  : ");
        int a = in.nextInt();
         
        System.out.print("Input second number : ");
        int b = in.nextInt();

        System.out.print("Input Third number  : " );
         int c= in. nextInt();

        System.out.print("Input fourth number : ");
        int d = in.nextInt();

        System.out.print("Input fivth number  : ");
        int e = in.nextInt();


         System.out.println(" Average  of five number : " +( a+b+c+d+e)/5 );

    
    }
}
