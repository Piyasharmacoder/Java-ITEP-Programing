import java.util.Scanner;
// find the middle element in the String or number ;

public class Methode10 {

    /*
     * public static void findMiddleCharacter(){
     * String name = "piyanka";
     * int mid = name.length()/2;
     * char c = name.charAt(mid);
     * System.out.println(" The mid Element is : " + c);
     * 
     * }
     * public static void main(String[] args) {
     * findMiddleCharacter();
     * 
     * }
     */

    // __________________________________________________________________________________________________________________________________//
    // Type Second
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Input a string : ");
        String str = Sc.nextLine();
        System.out.println(" The middle character is : " + findmiddle(str) + "\n");

    }

    public static String findmiddle(String str) {
        int position;
        int length;
        if (str.length() % 2 == 0) {
            position = str.length() / 2 - 1;
            length = 2;

        } else {
            position = str.length() / 2;
            length = 1;
        }
        return str.substring(position, position + length);

    }
}
