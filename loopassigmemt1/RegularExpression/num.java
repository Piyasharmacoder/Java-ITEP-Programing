package RegularExpression;

import java.util.Scanner;

public class num {
    public static void main(String[] args) {
        for (;;) {
            try {
                System.out.println("Enter the  number : ");
                Scanner sc = new Scanner(System.in);
                String num = sc.nextLine();
                if (num.matches("^[0-9]{10}+$")) {
                    System.out.println("number is valid");
                } else {
                    System.out.println("Number  is not valid");
                }
            } catch (Exception e) {
            
            }

        }

    }

}
