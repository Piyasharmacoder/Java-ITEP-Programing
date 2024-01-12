
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class Test5 {
    // public static void main(String[] args) {
    // /*
    // * Scanner sc = new Scanner( System.in);
    // * System.out.print(" Enter the number : ");
    // * int n= sc.nextInt();
    // * System.out.print( " Enter the number :");
    // * int a= sc.nextInt();
    // */

    // int a = 1;
    // for (int i = 1; i <= 10; i++) {
    // for (int j = 1; j <= 10; j++) {
    // System.out.print( " " + (j * a));
    // }
    // System.out.println( " ");
    // a++;

    // }
    // }

    // }
    // -----------------------------------------------.//------------------------------------------------//
    // WAP to print the table 2 to 10 (2nd) types

    public static void main(String[] args) {
        int n = 10;
        int i, j;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= 10; j++) {
                System.out.printf(" %2d", (i * j));
                System.out.print("  ");
            }
            System.out.println(" ");
        }

    }

// -----------------------------------------------------------------------------------------------//
// WAP to print the table 2 to 10 (3nd) types//

/*
 * public static void main(String []args ){
 * int i,j;
 * for(i=1; i<=10; i++ ){
 * for ( j=1; j<=10; j++){
 * System.out.println(i+ " * "+j+" =" +i*j );
 * }
 * System.out.println(" " );
 * }
 * 
 * }}
 */
 } 