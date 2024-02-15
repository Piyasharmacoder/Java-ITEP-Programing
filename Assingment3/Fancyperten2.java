package Assingment3;

import java.util.Scanner;

public class Fancyperten2 {
    public static void main(String[] args) {
        Scanner Sc= new Scanner(System.in);
        System.out.println(" Entry any numbe : ");
        int n= Sc.nextInt();
        // for numerical parten loop
         int count=1;
        for( int i=1; i<=n; i++){
            for( int j=1; j<=i; j++){
            System.out.print(count);
            count++;
        }
        System.out.println();
    }
    // shrinking phase 
    int sp= count-n;
    for( int i=1; i<=n; i++){
        for( int j=n; j>=i; j--){
          System.out.print(sp);
          sp++;
        }
        System.out.println();
    }
}
}