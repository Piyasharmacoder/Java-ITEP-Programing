// nasted if else 

import java.util.Scanner;

public class Test15 {
    public static void main(String[] args) {
        int charge1, charge2, charge3, charge4;

        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter distance : ");
        int distance = Sc.nextInt();
        if (distance <= 10) {
            charge1 = 80;
        } else if (distance <= 20) {
            charge2 = 80 + 6 * (distance - 10);
        } else if (distance <= 30) {
            charge3 = 80 + 60 + (distance - 20) * 5;
        } else if (distance >= 31) {
            charge4 = 80 + 60 + 50 + (distance - 30) * 4;
            System.out.println("charge : " + charge4);
        }
        System.out.println();

    }

}
