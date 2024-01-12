
//natueral number print and , find its sum
import java.util.Scanner;

public class Test2 {
    public static void main( String []args ){
        Scanner sc = new Scanner( System.in);
        System.out.print( " Enter the n natural no :");
        int n =sc.nextInt();
      //  int n=10;
        int sum =0;
        for ( int i= 1; i<=n; i++ ){ 
            sum =sum + i;

          System.out.print(i);
    }
         System.out.println("\n sum of natural no =" + sum );
        
    }

    
}