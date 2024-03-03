import java.util.Scanner;

public class Contional_prog_traingle2 {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("enter mobile number\n");
                long number = sc.nextLong();
                if (number >= 1000000000L && number <= 9999999999l) {
                    System.out.println(number + " number is valid\n");
                } else {
                    System.out.println("number lengt shud be 10 digits\n");
                }
            } catch (Exception e) {
                System.out.println("carecters is not allowed\n");
            }
        }
    }
}
