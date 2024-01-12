package Assingment3;

import java.util.Scanner;

public class prten43 {
    public static void main( String []args ){
        Scanner sc =new Scanner (System.in );
        System.out.print(" Enter the number :  ");
        int n = sc.nextInt();
        int i,j,sp;
        for( i=1; i<=n;  i++){
            // for space 
            for( sp=1;sp<i; sp++ ){
                System.out.print(" ");
            }
            for( j=1; j<=( i*2-( 2*i-i)); j++){
                System.out.print("@ ");
            }
            System.out.println();
        }
    }
    
}

    
