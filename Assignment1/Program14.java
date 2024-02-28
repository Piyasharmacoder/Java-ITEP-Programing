package Assignment1;

import java.util.Scanner;
// WAP to convert lowercase into uppercase 

public class Program14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the string in lowercase  :");
        String lw = in.nextLine();
        String up = lw.toUpperCase();
        System.out.println("Reulte in uppercase  :  " + up);

    }

}
