package Assignment1;

import java.util.Scanner;

// print odd prime number 
public class Program21 {
    // even prime number sirf 2 hota baki sab odd hote hai
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, b = 0, c = 0;
        System.out.print("Enter the  number of range ");
        n = sc.nextInt();
        System.out.print(" Odd prime number is given below  : ");
        for (int i = 1; i < n; i++) { // this loop provide range 
            for (int a = 1; a < i; a++) { // this loop divide each elemnt  and check 
                if (i % a == 0) {
                    c++;
                    b = i;
                }
            }
            if ((c==2)&&(b%2!=0)) {
                System.out.println(b); 
            }
            c=0;
        }

    }

}
