import java.util.Scanner;

// 1)wap to print  (squar ) n number series 1,4,9,16,25-----------------------------------------n.//
// 2) wap to sum of the serise 1+4+9+16+25----------------------------------------n+n//
public class Progmse7 {
  public static void main(String args[]) {
    Scanner Sc = new Scanner(System.in);
    System.out.print(" Enter the number :");
    int n = Sc.nextInt();
    int sum = 0;

    for (int i = 1; i <= n; i++) {
      sum = sum + i * i;
      System.out.print(i * i + " + ");
    }
    
    System.out.println("\nSum of the serise = " + sum);
  }

}
