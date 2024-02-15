// find any number of factorial 

import java.util.Scanner;

public class R2 { 
    // create a methode or function
    public static int calculatefactorial ( int n){
        // base case 
        if ( n==1 || n==0){
            return 1;
        }
        // processsing 
         int recursionkaans = calculatefactorial(n-1);
         // recursion call
         int finalAns = n*recursionkaans;
         return finalAns;
    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner( System.in);
        System.out.print(" Enter any number :");
        int n =  Sc.nextInt();
        int ans = calculatefactorial(n);
        System.out.println( " factorial of number :  " + ans);

    
    }

    
}
