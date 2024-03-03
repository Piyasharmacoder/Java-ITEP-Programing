import java.util.Scanner;

public class Contional_prog_traingle {
    // cheack if a traingle is a right angle traingle or isolate traingle .

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First side  : ");
        int a = sc.nextInt();
        System.out.print("Enter the second side : ");
        int b = sc.nextInt();
        System.out.print("Enter the third side  : ");
        int c = sc.nextInt();

        // if cheack the traingle is right angled triangle
        // using pathgorous therom C^2 = a^2 +b^2
        if (c == Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2))) {
            System.out.println("This Traingle is right angled  ") ;
        }
    
         // check if the traingle is isoceles 
         if (a==b||b==c||c==a) {
             System.out.println("This Traingle is isoceles   ");
         }


        // else {
        //     System.out.println("This traingle is  not  of know is types  ");
        // }

    }

}
