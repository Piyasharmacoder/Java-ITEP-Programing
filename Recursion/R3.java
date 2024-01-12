   
// print the fibonacci sequence till nth number threm*

import java.util.Scanner;

public class R3 {
    /*public static  void  printfibonacci( int a , int b, int n){
        // base case 
         if( n==0){
            return;
         }
         // processing 
        int c = a+b;
        System.out.println(c);
        printfibonacci( b, c, n-1);                //  <--recursion call
    
    }
    public static void main(String[] args) {
         int a =0 ,  b =1; 
         System.out.println(a);
         System.out.println(b);
         int n = 7; 
         printfibonacci( a, b, n-2 );
    }*/

    //------------------------------------------------------------------------------------------------------------------------------------
    public static  int fibonacci( int n){
        // base case 
        if( n==0){
            return 0;
        } if( n==1){
            return 1;
        }
        //processing 
        int ans = fibonacci(n-1)+fibonacci(n-2);
        return ans;
    }
     public static void main(String[] args) {
        System.out.println(fibonacci(9));  
}}
