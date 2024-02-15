package Basicprogram.operators.AssigbmentOperator;

import java.util.Scanner;

// simple Assingment 

class SumEqule {
    public void EquleAssi(int g, int h) {

        if (g != h) {
            System.out.println(" not Equle ");
        }

        else {
            System.out.println(" this is  Equle ");
        }

    }
}

class Exmple {
    static void Mulassingment(double a, double b) {
        double mul = a +b;
        if (mul >= 0) {
            System.out.println(" its a positive value : " + mul);
        }
        else{
            System.out.println(" not positve value :  "+ mul);
        }
        
    }
}

public class Assi1 {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print(" Enter the value of g :  ");
        int g = Sc.nextInt();
        System.out.print(" Enter the value of h : ");
        int h = Sc.nextInt();
        System.out.println();

        System.out.print(" Enter the value of a : ");
        double a = Sc.nextDouble();
        System.out.print(" Enter the value of b : ");
        double b = Sc.nextDouble();
        System.out.println();

        /*
         * int a, b, c, d;
         * 
         * a = b = c = d = 10;
         * boolean x = (a == b) == (c == d);
         * System.out.println("x :" + x);
         */

        SumEqule obj = new SumEqule();
        obj.EquleAssi(g, h);
        System.out.println("---------------");

        Exmple obj1 = new Exmple();
        obj1.Mulassingment(a, b);

    }

}