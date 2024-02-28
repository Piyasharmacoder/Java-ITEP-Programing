import java.util.Scanner;

// wap to print all prime number in given rangs------------------
public class Progmse19 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the rang : ");
      System.out.print("enter num1 : ");
      int num1 = sc.nextInt();
      System.out.print("entr thenum2 :");
      int num2 = sc.nextInt();
      System.out.println("print all prime number this rang ");
      for (int i = num1; i <= num2; i++) {
         int count = 0;
         for (int j = 1; j <= i; j++) {
            if (i % j == 0)
               count++;
            break;
         }
         if (count == 0){

            System.out.println(count+ " ");
         }
      }

   }
}