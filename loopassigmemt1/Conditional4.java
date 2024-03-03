import java.util.Scanner;

public class Conditional4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the distence : ");
        int  distance = sc.nextInt();
        int charge;
        if (distance<=10) {
        charge = 80;
        }
        else if (distance<=20) {
            charge= 80+6*distance-10; 
        }
        else if (distance<=30) {
            charge= 80+60+(distance-20)*5;
            
        }
        else if (distance>=31) {
            charge = 80+60+50+(distance-30)*4;
            
        }
        System.out.println("charge" + charge);
    }

    
}
