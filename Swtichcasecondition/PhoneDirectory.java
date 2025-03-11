package Swtichcasecondition;

import java.util.HashMap;
import java.util.Scanner;


public class PhoneDirectory {

    public static void main(String[] args) {
        HashMap<String, String> phoneDirectory = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Find phone number by name");
            System.out.println("2. Add a new name with phone number");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    if (phoneDirectory.containsKey(name)) {
                        System.out.println("Phone number: " + phoneDirectory.get(name));
                    } else {
                        System.out.println("Name not found in the directory.");
                    }
                    break;
                case 2:
                    System.out.print("Enter name: ");
                    name = scanner.nextLine();
                    System.out.print("Enter phone number: ");
                    String phoneNumber = scanner.nextLine();
                    phoneDirectory.put(name, phoneNumber);
                    System.out.println("Entry added successfully.");
                    break;
                case 3:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
