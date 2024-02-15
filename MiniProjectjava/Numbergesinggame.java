package MiniProjectjava;

import java.util.Scanner;

class Range{
 public int Counting( int max,int min){
    return(int )(Math.random()+(max-min+1)+ min);

 } 

 }
public class Numbergesinggame {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in );
        Range rg = new Range();
        int totalAttempts =0;
        int win =0;


        while (true) {
            System.out.print(" Enter the maximum number :");
            int max = sc.nextInt();
            System.out.print(" Enter the minimum number :");
            int min = sc.nextInt();

              
            int calculatenumber = rg.Counting(max, min);
            int Attempts =0;


            while (true) {
                System.out.println("Guess the number between" +max+ " and " +min);
                int Guessnumber = sc.nextInt();
                Attempts++;


                if (Guessnumber>calculatenumber) {
                    System.out.println(" Its a Greater number. "); 
                }
                else if (Guessnumber<calculatenumber) {
                    System.out.println("Its a Smallest number. ");
                
                    
                }else{
                    System.out.println("correct Guessing number. ");
                    win++;
                    break;
                }
                
            }
            totalAttempts+=Attempts;
            System.out.println("Attempts : "+ Attempts);
            System.out.println("Winner :"+ win);
             
             double Winrate =( double) win/totalAttempts+100;
             System.out.printf(" Your winrate is %.2f%%\n ", Winrate );

             System.out.println("Do you want to play again (Yes/N0)");
             String playAgain = sc.next();
             if(!playAgain.equalsIgnoreCase("yes")){
                sc.close();
                System.exit(0);


             } 
             sc.nextLine();
            
        }
    }
    
}
 