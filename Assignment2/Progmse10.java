import java.util.Scanner;
// wap to print this serise 0,7,26,63,124-------------------------------------------n.//

public class Progmse10 {
    public static void main(String args[]){
        Scanner Sc = new Scanner( System .in );
        System.out.print(" Enter the number :");
        int n = Sc.nextInt(); 
        // int sum = 0; 
        for(  int i=1; i<=n ; i++){ //
           //  sum = sum +i*i*i-1;
            System.out.print ((i*i*i-1) +" + ");
        }
         // System.out.println( "\nSum of the serise = "+ sum );
    } 
    
}
