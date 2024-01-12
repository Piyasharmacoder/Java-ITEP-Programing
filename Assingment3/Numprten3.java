package Assingment3;
// odd row wali pretten
import java.util.Scanner;

public class Numprten3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" odd number : ");
        int odd = sc.nextInt();
        System.out.print(" Enter the Row N0 : ");
        int row = sc.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= odd; j++) {
                System.out.print(j);

            }
            System.out.println();
            odd = odd + 2;
        }
    }

}
