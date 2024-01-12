package Assingment4;
// if else use progrma----------------------------//
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner( System .in);
        System.out.print(" Enter the Age :");
        int age = sc.nextInt();
        if (age < 18) {
            System.out.println(" you are not audalt .");
        }
        if (age > 18) {
            System.out.println(" you are audalt.");
        }
        if( age==18){   // yaha else ka use bhi kr skte hai//
            System.out.println(" you are also audalt ");
        }

    }

}
