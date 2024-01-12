
package Assignment1;
import java.util.Scanner;
class Program3 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.print("  Enter the age : ");
          int age = sc.nextInt();
          String eligible = (age >= 18) ? "   eligible " : "Not eligible";
          System.out.println(eligible);
     }
}
