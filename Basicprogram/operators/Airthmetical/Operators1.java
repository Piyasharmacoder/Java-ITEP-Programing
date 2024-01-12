package Basicprogram.operators.Airthmetical;

public class Operators1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = a++ + ++b;
        int d = --a + --b + c--;
        int e = a + +b + +b + a--;
        int f = -a + b-- + -c - d++;
        int sum = a + b + c + d + e + f;
        System.out.println(" sum = " + sum);

    }
}
