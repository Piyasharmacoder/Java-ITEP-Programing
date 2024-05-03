package MiniProjectjava;

import java.util.Random;
import java.util.Scanner;

public class RockPeperSciserGam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 0 for rock , 1 fo peper ,2 for scissior  : ");
        int userInput = sc.nextInt();

        // generate a ramdom number
        Random random = new Random();
        int ComputerInput = random.nextInt(3);

        // giving condition and write a logic
        if (userInput == ComputerInput) {
            System.out.println("Match is Draw .");

        } else if (userInput == 0 && ComputerInput == 2 || userInput == 1 && ComputerInput == 0 ||
                userInput == 2 && ComputerInput == 1) {
            System.out.println(" ____You Win____ ");

        } else {
            System.out.println("___Computer Win___");
        }

        // System.out.println("Computer Choice  "+ ComputerInput);
        if (ComputerInput==0) 
        {
            System.out.println("Computer choice Rock ");
            
        }
        else if (ComputerInput==1){
            System.out.println("Computer choice Peper");
        }
        else if (ComputerInput==2){
            System.out.println("Computer choice Scissor");
        }

        }

    }
