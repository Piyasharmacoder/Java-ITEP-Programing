package StringINjava;

import java.util.Scanner;
import java.util.*;

//  print each  character of the String in Seprate line with its ASCII Coed

public class StringQues19 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a charter : ");
        String str = sc.nextLine();
        System.out.println("\nPrint in Seperate line :\n");
        System.out.println("characters : ASCII Code");

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            System.out.println(     c+ "          :      "+ (int)c);// only add (int)c)

        }
        System.out.println();

    }

}
