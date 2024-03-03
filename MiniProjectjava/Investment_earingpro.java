package MiniProjectjava;

import java.util.Scanner;
import java.text.*;

public class Investment_earingpro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Buying  price per Share : ");
        double Buyingprice = sc.nextDouble();
        int day = 1;
        double closingPrice = 0.1;
        DecimalFormat df = new DecimalFormat("0.00");

        while (true) {
            System.out.println("Enter the closing  price of the day : " + day + " (any nagetive value to leave : ");
            closingPrice = sc.nextDouble();
            if (closingPrice < 0.0)
                break;
            double earings = closingPrice - Buyingprice;
            if (earings > 0) {
                System.out.println("After day " + day + " you earned " +  df.format(earings) + " per share .");

            } else if (earings < 0.0) {
                System.out.println("After day" + day + " you lost " + df.format(-earings) + " per share .");

            } else {
                System.out.println("After day" + day + " you have " + "no earing per share .");
            }
            day += 1;
        }
        sc.close();
        System.out.println();

    }

}
