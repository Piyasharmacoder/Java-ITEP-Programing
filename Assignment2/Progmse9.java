import java.util.Scanner;
//1) Wap to print this seris 0,3,8,15,24,35-------------------------------------------n.//
//2) wap to sum of the serise 0+3+8+15+24+35+-----------------------------------n+n//
public class Progmse9 {
    public static void main(String args[]){
        Scanner Sc = new Scanner( System .in );
        System.out.print(" Enter the number :");
        int n = Sc.nextInt();
       // int sum=0;
        for(  int i=1; i<=n ; i++){  // int sq=i*i-1;
          //  sum=sum+i*i-1;        // sum =sum+sq;
            System.out.print(i*i-1 +" + ");
        }
       // System.out.println("\nSum of the serise = "+ sum );
    } 
}
