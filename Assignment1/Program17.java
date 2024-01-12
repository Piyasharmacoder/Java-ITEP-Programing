package Assignment1;

import java.util.Scanner;

public class Program17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter the Height in inche   : ");
        double Height = sc.nextDouble();
        double inche = 2.54;
        double cm = Height * inche;
        System.out.println(" Heigth in centimeter : " + cm);
    }

}
