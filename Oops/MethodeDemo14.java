import java.util.Scanner;

class Table_practics {
    static void printTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.format("%d X %d = %d\n ", n, i, n * i);
        }
    }
}

class problem2 {
    static void printpartten(int m) {
        for (int i = 0; i<=m; i++) {
            for (int j=0; j<=i; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
        
    }

}
class Problem3{
    static void  findvalumeofcylindr(int r, int h, float volume ){
        volume = 22/7*r*r*h;
        System.out.println(" valume of cylinder is : " + volume);
    }
}

public class MethodeDemo14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" enter the number :");
        int n = sc.nextInt();
        Table_practics obj = new Table_practics();
        obj.printTable(n);

        System.out.print(" Enter the number of m  : ");
        int m = sc.nextInt();
        problem2 obj1 = new problem2();
        obj1.printpartten(m);


        System.out.println(" Enter the value of  ");
        int r= sc.nextInt();
        int h=sc.nextInt();
        Problem3 obj2 = new Problem3();
        obj
    

    }

}
