package MiniProjectjava;

import java.util.Scanner;

// ask for the pin 
// chaek amount 
// depoiste money 
// withdrwa money 
//limtetion--->
// jaise hi code run ho usre se pucha jaye 
//1 enter your PIN


class ATM {
    float balance;
    int PIN = 3841;

    public void checkpin() {
        System.out.print(" Enter your pin : ");
        Scanner Sc = new Scanner(System.in);
        int EnterthePIN = Sc.nextInt();

        // if check PIN is correct or not
        if (EnterthePIN == PIN) {
            Mainmenu();

        } else {
            System.out.println("Enter the invalid PIN");
            Mainmenu(); 
        }
    }

    public void Mainmenu() {
        System.out.println();
        System.out.println(" Select your option ");
        System.out.println("    1.Check the balance :");
        System.out.println("    2.  Withdrwa Money  :");
        System.out.println("    3. Deposited Money  :");
        System.out.println("    4. Exit ");

        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        boolean flag = true;
        if (option == 1) {
            checkBalanc();

        } else if (option == 2) {
            withdrawmony();

        } else if (option == 3) {
            Depositmony();

        } else if (option == 4) {
            return;

        }

        else {
            System.out.println(" Enter a invalid choice ");
        }

    }

    public void checkBalanc() {
        System.out.println(" your currentely Balance : " + balance);
        Mainmenu();
    }

    public void withdrawmony() {
        System.out.print("Enter Amount ot Withdrwa : ");
        Scanner sc = new Scanner(System.in);
        float Amount = sc.nextFloat();

        if (Amount > balance) {
            System.out.println(" Insufficient Balance  in your account ");

        } else {
            balance = balance - Amount;
            System.out.println(" Money Withdrwal Successfully.");
        }
        Mainmenu();
    }

    public void Depositmony() {
        System.out.print(" Enter the Amount : ");
        Scanner sc = new Scanner(System.in);
        float Amount = sc.nextFloat();
        balance = balance + Amount;
        System.out.println(" Money  Successfully Deposite ");
         Mainmenu();
    }
}

public class ATMachine2 {
    public static void main(String[] args) {

        ATM obj = new ATM();
        obj.checkpin();

    }

}
