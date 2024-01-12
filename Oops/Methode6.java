public class Methode6 {
    static int addition(int a, int b) { // method1
        System.out.println(" Enter the number  a = " + a + " And b = " + b);
        int Sum = a + b;
        return Sum;
    }

    static int subtraction(int a1, int b1) { // method2 
        System.out.println(" Enter the number a1 = " + a1 + ", b1 = " + b1);
        int Sub = a1 - b1;
        return Sub;

    }

    static int MUltifiction(int a2, int b2) { // method3 
        System.out.println(" Enter the number  a = " + a2 + " And b = " + b2);
        int Mul = a2 * b2;
        return Mul;
    }

    static int Division(int a1, int b1) { // method4
        System.out.println(" Enter the number a1 = " + a1 + ", b1 = " + b1);
        int div = a1 / b1;
        return div;

    }

    public static void main(String[] args) {

        // now all methodes call  
        System.out.println(" Addition : " + addition(10, 20));
        System.out.println();
        System.out.println(" Substraction : " + subtraction(12, 10));
        System.out.println();
        System.out.println(" multifiction : " + MUltifiction(10, 80));
        System.out.println();
        System.out.println(" Division : " + Division(12, 4));
    }

}
