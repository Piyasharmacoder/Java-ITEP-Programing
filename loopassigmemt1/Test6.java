
import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any year : ");
        int year = sc.nextInt();
        if (year % 4 == 0) {
            System.out.println(" This year is leap year :" + year);
        } else {
            System.out.println(" This year is not leap year : " + year);
        }
    }
}
