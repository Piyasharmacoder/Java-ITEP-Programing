import java.util.Scanner;

public class BitCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number and the bit position
        System.out.print("Enter the number (num): ");
        int num = scanner.nextInt();
        System.out.print("Enter the bit position (n): ");
        int n = scanner.nextInt();

        // Use bitwise AND to check if the nth bit is set
        int mask = 1 << n; // Create a mask with nth bit set
        if ((num & mask) != 0) { // Check if nth bit is 1
            System.out.println("The " + n + "th bit is set (1).");
        } else {
            System.out.println("The " + n + "th bit is not set (0).");
        }

        scanner.close();
    }
}
