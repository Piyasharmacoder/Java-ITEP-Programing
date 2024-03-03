package Assignment1;

//  1) wap to  swap two number using third variable 
import java.util.Scanner;

class Program8 {

  /*
   * public static void main(String[] args) {
   * Scanner sc = new Scanner(System.in);
   * int x, y, z;
   * System.out.println("Enter the value of x and y :");
   * x = sc.nextInt();
   * y = sc.nextInt();
   * 
   * System.out.println("Before swapping No :" + x + " , " + y);
   * 
   * z = x;
   * x = y;
   * y = z;
   * 
   * System.out.println("After swapping :" + x + "  , " + y);
   * System.out.println();
   * }
   */
  // ---------------------------------------------------------------------------------------------------//


  // 2) swap two number withouth using third variables----//

 /*   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the value of  X and y : ");
    int X = sc.nextInt();
    int y = sc.nextInt();
    System.out.println("Before swapping No :" + X + " , " + y);
    X = X + y;
    y = X - y;
    X = X - y; 
    System.out.println("After swapping :" + X + "  , " + y);
    System.out.println();
  }*/

  //--------------------------------------------------------------------------------------------------//

  // 3)  wap to swap two number without third variables type 3//
/*   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the value of  X and y : ");
    int X = sc.nextInt();
    int y = sc.nextInt();
    System.out.println("Before swapping No :" + X + " , " + y);
    X = X * y;
    y = X / y;
    X = X / y;
    System.out.println("After swapping :" + X + "  , " + y);
    System.out.println();
  }*/

  //-----------------------------------------------------------------------------------------------//
  // 4) wap two swap two number without using thrid variable and arithmatic + - * / opreators-- type 4//
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the value of  X and y : ");
    int X = sc.nextInt();
    int y = sc.nextInt();
    System.out.println("Before swapping No : X = " + X + " and  y = " + y);
    X = X ^ y; // using xor operators
    y = X ^ y; //xor
    X = X ^ y; //xor
    System.out.println("After swapping : X = " + X + "  and   y = " + y);
    System.out.println();
  }
}

