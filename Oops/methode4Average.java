import java.util.Scanner;

public class methode4Average {
   public static double findAaerage(double X, double Y, double Z) { /// methode create
      double Sum = X + Y + Z;
      return Sum / 3; // we can also write their {( X+Y+Z)/3}
   }

   public static void main(String[] args) {
      int a = 10, b = 12;
      Arthmetic_Operation obj = new Arthmetic_Operation();
      obj.add(a, b);
      
      Scanner Sc = new Scanner(System.in);
      System.out.print(" Enter the first number : ");
      double X = Sc.nextInt();
      System.out.print(" Enter the second number : ");
      double Y = Sc.nextInt();
      System.out.print(" Enter the third number :  ");
      double Z = Sc.nextInt();
      System.out.print(" Average of number is  = " + findAaerage(X, Y, Z)); // methode call

   }

}
