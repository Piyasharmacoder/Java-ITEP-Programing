  package Assignment1;

/*public class Program7 { 
    public static void main(String[] args) {
        float P, R, T, SI;
        P = 2500;
        R = 20;
        T = 5;
        SI = (P * R * T) / 100;
        System.out.println("Simple interest is :" + SI);

    }

} */ 

import java.util.Scanner;

 class program7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the principal : ");
        double P = in.nextInt();

        System.out.print("Enter the Rate      : ");
        double R = in.nextInt();

        System.out.print(" Enter the Time     : ");
        double T = in.nextInt();

        double SimpleInterest = (P * T * R) / 100;

        System.out.println(" Principal     : " + P);
        System.out.println(" Interest Rate : " + R);
        System.out.println(" Time Duration : " + T);

    }
}
