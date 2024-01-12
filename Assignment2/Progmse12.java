import java.util.Scanner;

public class Progmse12 {
    // wap to print the serise 2,9,28,65,126-----------------------------n.//
   /*  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter the number : ");
        int n = sc.nextInt();
        int sum =0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i*i*i+1;
            System.out.print((i * i * i + 1) + " + ");
        }
        System.out.println("\nSum of the serise = "+ sum );
    }*/

//------------------------- wap to print sum of the seris  1/2+ 1/9+ 1/28 + 1/65 ----------------------------------------1/n trem--------//

public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter the number : ");
        int n = sc.nextInt();
         double sum =0;
        for (int i = 1; i <= n; i++) {
            int cube=i*i*i; 
            double term= 1.0/(cube+1);
            sum = sum + term;
            System.out.print(" 1/"+ (cube+1) + " + ");
        }
        System.out.println("\nSum of the serise = "+ sum );
    }
}
