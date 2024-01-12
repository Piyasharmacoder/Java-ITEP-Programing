// WAP with a methode named get Total thats accepts three integer as an argument and return its sum . call this method from main()and print the 
//result.

import java.util.Scanner;

public class Methode3 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int num1, num2, num3;
        System.out.print(" Enter the first number  : ");
        num1 = Sc.nextInt();
        System.out.print(" Enter the Second number : ");
        num2 = Sc.nextInt();
        System.out.print(" Enter the thrid number  : ");
        num3 = Sc.nextInt();

        int Sum = getTotal(num1, num2, num3);
        System.out.print(" Sum : " + Sum);

    }

    public static int getTotal(int number1, int number2, int number3) { // metnode create
        return number1 + number2 + number3;
    }

}
