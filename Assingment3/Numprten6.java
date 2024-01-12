package Assingment3;
import java.util.Scanner;
public class Numprten6 {
    public static void main ( String [] args ){
        Scanner sc =  new Scanner ( System .in );
        System.out.print(" Entr the number n :");
        int n= sc.nextInt();
        System.out.print(" Enter the even value : ");
        int even = sc.nextInt();
        int i,j,sp;
        for( i=1; i<=n; i++){
            for( sp=1; sp<=i;sp++){
                System.out.print(" ");
            }
            for(j=1; j<=n-even; j++){
                System.out.print(j);
            } 
            System.out.println();
            even = even+2;
        }
        
    }
}
    

