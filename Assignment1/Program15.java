
package Assignment1;

import java.util.Scanner;
// cheak string is lowercase or upper case 
public class Program15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out. print(" Enter the Chareacter in Upper case  :");
        char c = sc.next().charAt(0);
        boolean U = ((c >= 'A') && (c <= 'Z'));
        System.out.println((U) ? " The chareacter is uppercase." : " The charecter is lowercase.");
    }

}
