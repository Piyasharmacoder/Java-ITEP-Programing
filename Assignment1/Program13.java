package Assignment1;
//WAP to print String upper case to lower case 
import java.util.Scanner;

class Program13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the string in uppercase  :");
        String Up = in.nextLine();
        String lw = Up.toLowerCase();
        System.out.println("Reulte in lowercase  :  " + lw);

    }

}
