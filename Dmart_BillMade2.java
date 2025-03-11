
import java.util.*;

public class Dmart_BillMade2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input customer details
        System.out.print("Name of customer: ");
        String name = sc.nextLine();
        System.out.print("Gender: ");
        String gender = sc.nextLine();
        System.out.print("Date: ");
        String date = sc.nextLine();

        System.out.print("How many items are you purchasing? ");
        int itemCount = sc.nextInt();
        sc.nextLine(); // consume the newline

        String[] itemNames = new String[itemCount];
        int[] quantities = new int[itemCount];
        double[] prices = new double[itemCount];
        double[] totals = new double[itemCount];
        double[] discounts = new double[itemCount];

        // Input items dynamically
        for (int i = 0; i < itemCount; i++) {
            System.out.print("Enter name of item " + (i + 1) + ": ");
            itemNames[i] = sc.nextLine();

            System.out.print("Enter quantity of " + itemNames[i] + ": ");
            quantities[i] = sc.nextInt();

            System.out.print("Enter price of " + itemNames[i] + ": ");
            prices[i] = sc.nextDouble();
            sc.nextLine(); // consume the newline

            // Calculate total and apply discounts
            totals[i] = quantities[i] * prices[i];
            if (quantities[i] > 10) {
                discounts[i] = totals[i] * 0.15; // 15% discount for bulk purchase
            } else if (quantities[i] > 5) {
                discounts[i] = totals[i] * 0.10; // 10% discount for medium purchase
            } else {
                discounts[i] = 0;
            }
        }

        // Calculate grand total
        double grandTotal = 0;
        for (int i = 0; i < itemCount; i++) {
            grandTotal += (totals[i] - discounts[i]);
        }

        // Add GST
        double gst = grandTotal * 0.10; // 10% GST
        grandTotal += gst;

        // Check for carry bag
        System.out.print("Do you want a carry bag? (yes/no): ");
        String carryBag = sc.nextLine();
        if (carryBag.equalsIgnoreCase("yes")) {
            grandTotal += 10; // Add carry bag charge
        }

        // Print the bill
        System.out.println("\n\n\t\t\t\t\t D-MART \t\t\t");
        System.out.println("Name: " + name + "\t\t\t\t\t\t\tDate: " + date);
        System.out.println("Gender: " + gender);
        System.out.println(
                "------------------------------------------------------------------------------------------------");
        System.out.println("Item Name\t\t\tQuantity\t\t\tPrice\t\t\tTotal\t\t\tAfter Discount");

        for (int i = 0; i < itemCount; i++) {
            System.out.printf("%s\t\t%d\t\t\t%.2f\t\t%.2f\t\t%.2f\n",
                    itemNames[i], quantities[i], prices[i], totals[i], (totals[i] - discounts[i]));
        }

        System.out.println(
                "------------------------------------------------------------------------------------------------");
        System.out.printf("Total (Before GST): %.2f\n", grandTotal - gst);
        System.out.printf("GST (10%%): %.2f\n", gst);
        if (carryBag.equalsIgnoreCase("yes")) {
            System.out.println("Carry Bag: 10.00");
        }
        System.out.printf("Final Total: %.2f\n", grandTotal);

        System.out.println("\nThank you for shopping at D-Mart!");
    }
}
