
import java.util.Scanner;
// print odd and even number./
public class Test8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println("Even number");
        }
        if (n % 2 != 0) {
            System.out.println(" Odd number");
        }
    }
}
