import java.util.Scanner;

public class Progmse15 {
    public static void main( String [] args ){
        Scanner sc=  new Scanner ( System.in);
        System.out.print(" Enter the number:"); 
        int n= sc.nextInt();
        int sum=0;
        for( int i=1; i<n; i++){
            if( n%i==0)
            sum= sum+i;
          System.out.println( i);
        }
        System.out.println(" Sum = " + sum);
         if ( sum==n)
        System.out.println(" yes ");
        else
        System.out.println(" no ");
    }
    
}
