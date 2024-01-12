 

package Assignment1;
import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result; 
 
class Program16 {

    public static void main(String []args){
        Scanner sc = new Scanner(System.in); 
         
        System.out.print(" Enter the 1st number  : ");
         int a = sc.nextInt();
         System.out.print(" Enter the 2nd number  : ");
         int b = sc.nextInt();
         int d='t';
        // boolean e = (a==b) &&(a!=b);
        boolean c=a==b;
         int x = (c)?d:(a<=b)?b:a;
         System.out.println("Result : "+x);
    }  
    
    
}
