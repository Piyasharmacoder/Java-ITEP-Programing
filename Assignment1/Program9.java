import java.util.Scanner;

class Program9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 5;
        int b = 10;
        System.out.println("Before swapping a = "  + a + "   ,   b=" + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping a = "  + a + "    ,   b=" + b);
    }

}
