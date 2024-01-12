import java.util.Scanner;

//wap to print this  reveser seriese, 10,9,8,7,6,5,4,3,2,1-----------------------n//
// And sum of this serise 10+9+8+7------------------------n.//
public class Progmse4 {
    public static void main(String args[]) {
        Scanner Sc = new Scanner(System.in);
        System.out.print(" Enter the number :");
        int n = Sc.nextInt();
        // int sum =0;
        for (int i = n; i >= 0; i--) 
        {
            // sum= sum+i;
            System.out.print(i + " , ");
        }
        // System.out.println(" \nsum of the = "+ sum);
    }

}
