package RegularExpression;

import java.util.Scanner;

public class R1 {
    public static void main(String[] args) {
        for (;;) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a Name : ");
            String name = sc.nextLine();
            if (name.matches("^[a-zA-Z0-9@./() ]+$")) {
                System.out.println("name is vaild");
            } else
                System.out.println("name is  not valid ");

        }
    }

}
