package Assingment3.Array;

import java.util.Scanner;

public class A2 {
     public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a[] =new int[6];
        System.out.println(" Enter the number ");
        for( int i=0; i<6; i++){
         a[i] = sc.nextInt();
        }
        
        System.out.println(" revers number ");
        for(int i=5;i>= 0;i--){
            System.out.println(a[i]);

        }
     }
    
}
