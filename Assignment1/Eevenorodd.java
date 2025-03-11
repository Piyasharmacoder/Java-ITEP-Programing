package Assignment1;

import java.util.Scanner;

public class Eevenorodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        
        // cheack if number is odd or Even

        if (num % 2 == 0) {   //condition
            System.out.println(num + "  :  number is  Even ");

        } else {
            System.out.println(num + "  :  number is not Even ");

        }

    }

}
