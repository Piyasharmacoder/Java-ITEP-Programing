package Assingment3;

import java.util.Scanner;

public class prten11 {
    public static void main(String[] args) {
    char i,j;
    for(i='A'; i<='E'; i++){
    for( j='A'; j<=i; j++){
    System.out.print( j );
    }
    System.out.println();
 
    }
    
    }
    // -----------------------------------------------------------------------------------------------------////
    /*
     * public static void main(String[] args) {
     * Scanner sc = new Scanner(System.in);
     * System.out.println(" Enter the no : ");
     * int n = sc.nextInt();
     * int i, j;
     * char ch;
     * for (i = 0; i < n; i++) {
     * 
     * for (j = 0; j<=i ; j++) {
     * 
     * ch = j+1 + 'A' - 1;
     * System.out.println(ch);
     * }
     * 
     * for (char alphabet = ch; alphabet > 'A'; alphabet--) {
     * System.out.print(alphabet);
     * }
     * }
     * 
     * }
     */

   /*  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the no : ");
        int n = sc.nextInt();
        for (int row = 0; row < n; row++) {

            for (int col = 0; col <= row; col++) {
                char ch = col + 1 + 'A' - 1;
                System.out.println(ch + " ");
            }

            for (int col = row - 1; col >= 0; col--) {
                char ch = col + 'A';
                System.out.println(ch + " ");
            }
            
            System.out.println();
        }

    }*/

}
