
import java.util.Scanner;

public class Test12 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner ( System.in );
        System.out.println(" Enter a any number between 1 to 7 : ");
        int Day = Sc.nextInt();
        if( Day ==1)
        System.out.println(" Monday ");
        else if( Day == 2)
        System.out.println(" Tuesday ");
        else if( Day ==3)
        System.out.println(" Wendnesday ");
        else if ( Day ==4)
        System.out.println(" Thursday");
        else if( Day==5)
        System.out.println(" Friday ");
        else if( Day ==6)
        System.out.println(" Saturday ");
        else if ( Day ==7)
        System.out.println(" Sunday ");
        else
        System.out.println("plsea Enter valid number .");
    }
}
