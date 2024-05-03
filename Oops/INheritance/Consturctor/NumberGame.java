package INheritance.Consturctor;

import java.util.Scanner;
import java.util.Random;


// Create a class game , whichc allows a user to play "Guess the number game "
// game  sdould  have  the  folloewing  methode 
// 1. Constructor  to generate the  random number
// 2. TakeUserInput() to  to take  a user input of number
// 3. isCorrectNUmber() to  detect whether the number is  entered  by the user is correct or no 
// 4. getter and setter for noofguesse 
// 5. use properties suchc as  noofguesse(int ),ect 

// now create a class game
class Game {
    // create constructor to generate random number
    public int NUmber;
    public int NoOfguesses;
    public int inputNumber=0;

    // use getter and setter for noofguesse
    public int getNoOfguesses() {
        return NoOfguesses;
    }

    public void setNoOfguesses(int NoOfguesses) {
        this.NoOfguesses = NoOfguesses;
    }

    Game() {
        Random rand = new Random();
        this.NUmber = rand.nextInt(100);
    }

    // create fuction for take user input of number
    void takeUserInput() {
        System.out.println("Guess the number ");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();

    }

    // create fuction for detect whether the number is entered by the user is
    // correct or no
    boolean isCorrectNUmber() {
        NoOfguesses++;
        if (inputNumber == NUmber) {
            System.out.format("Yes you guessed its rigth it was %d\n you guessed it  in %d attempts ", NUmber, NoOfguesses);
            return true;

        } else if (inputNumber < NUmber) {
            System.out.println("number is too Low...");

        } else if (inputNumber > NUmber) {
            System.out.println("NUmber is too high...");

        }
        return false;

    }

}

public class NumberGame {
    public static void main(String[] args) {
        Game gd = new Game();
        boolean b = false;

        while (!b) {
            gd.takeUserInput();
            b = gd.isCorrectNUmber();
            
        }

    }

}
