import java.util.Scanner;

class Arthmetic_Operation {
    public void add(int a, int b) { // parameterise method
        System.out.println("Addition :" + (a + b));
    }

    public void sub(int a, int b) { // parameterise method
        System.out.println("subtraction :" + (a - b));
    }

    public void mul(int a, int b) { // parameterise method
        System.out.println("multiplication :" + (a * b));
    }

    public void div(int a, int b) { // parameterise method
        System.out.println("division :" + (a / b));
    }

    public void add() { // default methord
        System.out.println("run default methord");
    }
}

public class Methode11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        Arthmetic_Operation obj = new Arthmetic_Operation();
        obj.add(a, b);
        obj.sub(a, b);
        obj.mul(a, b);
        obj.div(a, b);
    }
}
