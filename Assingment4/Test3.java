package Assingment4;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter the number :");
        int n = sc.nextInt();
        if (n % 5 == 0) {
            System.out.println("Is divisible by 5 ");
        }
        if (n % 5 != 0) { //use also else 
            System.out.println(" Not divisible by 5");
        }
    } 
//------------------------------------------------------------------------------------------------------------------------------//
/*public static void main ( String [] args ){
    Scanner sc = new  Scanner ( System.in );
    System.out.println(" Enter the characater  ");
    char ch = input.next().charAt(0);


}
*/

















}
