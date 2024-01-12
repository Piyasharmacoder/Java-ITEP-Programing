package MiniProjectjava;

import java.util.Scanner;

public class ATMproject 
{
    public static void main(String[] args)
     {
        int balnace = 10000000, withdraw, deposit;
        Scanner sc = new Scanner(System.in);
        while(true)
         {
            System.out.println(
                    "___________________________________|| Welcome Omkar Sharma ATM ||___________________________________ ");
            System.out.println("choose 1 for withdraw");
            System.out.println("choose 2 for deposit");
            System.out.println("choose 3 for check balance ");
            System.out.println("choose 4 for  Exist  ");
            System.out.println("choose  the opration  you want  to  prefrom :  ");
            int choice = sc.nextInt();
            switch (choice) 
            {
                case 1:
                    System.out.print("Enter the money to be withdraw : ");
                    withdraw = sc.nextInt();
                    if (balnace >= withdraw) 
                    {
                        balnace = balnace - withdraw;
                        System.out.print(" please collect you money . ");
                    } 
                    else 
                    {
                        System.out.print(" Insufficient Balance ");
                    }
                    System.out.println(" ");
                    break;
                case 2:
                    System.out.print("Enter money to deposited : ");
                    deposit = sc.nextInt();

                    balnace = balnace + deposit;
                    System.out.print(" your money has  been Successfully deposited ");
                    System.out.println("");
                    break;
                case 3:
                    System.out.print(" Balance : "  +balnace);
                    System.out.println("");
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }

}