// WAP using methode to count all the  vowels  in a string 

import java.util.Scanner;

public class Methodfindvowels {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print(" Enter the String : ");
        String str = Sc.nextLine();

        System.out.print(" NUmber of all vowels in this string " + Count_vowels(str) + "\n");

    }

    public static int Count_vowels(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u') {
                count++;
            }
        }
        return count;

    }

}
