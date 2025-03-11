package Assignment1;

import java.util.Scanner;

// print all odd prime number 
public class Program21 {
    // even prime number sirf 2 hota baki sab odd hote hai

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int n, b = 0, c = 0;
    //     System.out.print("Enter the  number of range ");
    //     n = sc.nextInt();
    //     System.out.print(" Odd prime number is given below  : ");
    //     for (int i = 1; i < n; i++) { // this loop provide range 
    //         for (int a = 1; a < i; a++) { // this loop divide each elemnt  and check 
    //             if (i % a == 0) {
    //                 c++;
    //                 b = i;
    //             }
    //         }

    //         if ((c==2)&&(b%2!=0)) {
    //             System.out.println(b); 
    //         }
    //         c=0;
    //     }

    // }



//_________________________________________________________________________________________________________________________________//

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number range: ");
        int n = sc.nextInt(); // Range input
        System.out.println("Odd prime numbers are given below:");

        for (int i = 3; i < n; i += 2) { // Start from 3 and increment by 2 (only odd numbers)
            if (isPrime(i)) {
                System.out.println(i); // Print the odd prime number
            }
        }

        sc.close(); // Close Scanner
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num < 2) return false; // Numbers less than 2 are not prime
        for (int j = 2; j <= Math.sqrt(num); j++) { // Check divisibility up to sqrt(num)
            if (num % j == 0) {
                return false;
            }
        }
        return true;
    }
}
