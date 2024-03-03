import java.util.Scanner;

public class Contional_Even_prog {
    // check if the nth power of number is even or not (Take the number , and the
    // power as input )
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number :  ");
        int num = sc.nextInt();

        System.out.print("Enter  the power : ");
        int power = sc.nextInt();

        // stroe thee reult in double
        double result = Math.pow(num, power); // genrete the power of the each number 

        if (result % 2 == 0) { // condition 
            System.out.println(result+ "  :  number is  Even ");

        } else {
            System.out.println(result+"  :  number is not Even ");

        }
    }

}
