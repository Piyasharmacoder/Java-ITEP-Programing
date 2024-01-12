package Assingment4;
//take a positive integer input and tell if it is even or odd //
import java.util.Scanner;
public class Test1 {
        public static void main(String[] args) {
            Scanner sc = new  Scanner(System .in );
            System.out.print(" Enter the  number :");
            int n = sc.nextInt();
            if (n % 2 == 0) {
                System.out.println(" The even number ");
            }
            if (n % 2 != 0) {
                System.out.println(" The number is odd");
            }
    
        }
    
    }

