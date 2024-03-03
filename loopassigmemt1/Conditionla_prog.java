import java.util.Scanner;

public class Conditionla_prog {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Character : ");
        char ch = sc.next().charAt(0);
        int ascii = (int) ch;

        // condition check alphabet uppercase or lowr case
        if (ascii >= 65 && ascii <= 90) {
            System.out.println("Upper case letter ");
        } else if (ascii >= 97 && ascii <= 122) {
            System.out.println("Lower case letter ");
        } else {

            System.out.println("The character is not alphabet ");
        }

    }
}
