package Assignment1;
import java.util.Scanner;

// take a character as input and check if it is Vowel or consonant
public class checkVowelorConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character : ");

        char ch = sc.next().charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'||ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println(ch + " is Vowel ");
        } else {
            System.out.println("This is consonant ");
        }
        sc.close(); // Added to close the Scanner
    }

}
