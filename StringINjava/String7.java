package StringINjava;

import java.util.Scanner;

public class String7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a : ");
        String st1 = sc.nextLine();
        System.out.println("Enter the value of b : ");
        String St2 = sc.nextLine();
        int i = st1.compareTo(St2);
        if (i == 0) {
            System.out.println("String are same .");
        } else if (i > 0) {
            System.out.println("Opposite to dictionary order . ");
        } else {
            System.out.println("Dictionary order .");
        }

    }

}
