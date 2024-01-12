package Assignment1;

import java.util.Scanner;

class program11 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the principal : ");
        double P = in.nextInt();

        System.out.print("Enter the Rate      : ");
        double R = in.nextInt();

        System.out.print(" Enter the Time     : ");
        double T = in.nextInt();

        double Amount = P * (Math.pow((1 + R / 100), T));
        double CompoundInterest = Amount - P;

        System.out.println(" All amount Insterest  :" + Amount);
        System.out.println(" Compound Insterest    :" + CompoundInterest);

    }

}