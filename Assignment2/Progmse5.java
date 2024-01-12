import java.util.Scanner;

// 1) wap to print all even number series, 2,4,6,8,10----------n.//
// 2) wap to sum of the serise 2+4+6+8+10-----------------------n+n//
public class Progmse5 {
       public static void main(String args[]) 
   {
      Scanner Sc = new Scanner(System.in);
      System.out.print("Enter the number :");
      int n = Sc.nextInt();    
      int sum =0;
      for (int i = 1; i<=n; i++) 
      {
          if (i % 2 == 0) // if i divible by only 2 so thats condition is true.
        {
           // sum= sum+i; 
           System.out.print(i + " , ");
        } 
      } 
      // System.out.println( "\n Sum of the serise= "+ sum );
   }     
}
