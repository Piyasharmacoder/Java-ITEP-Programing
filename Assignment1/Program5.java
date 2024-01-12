package Assignment1;

import java.util.Scanner;

class Program5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hindi     : ");
        int H = sc.nextInt();
        System.out.print("English   : "); 
        int E = sc.nextInt();

        System.out.print("Math      : ");
        int M = sc.nextInt();

        System.out.print("chemistry : ");
        int C = sc.nextInt();

        System.out.print("physics   : ");
        int P = sc.nextInt();
        double add = H + E + M + C + P;

        System.out.println("Tottal NO of  : " + add);
        double parcentage = (add / 500) * 100;
        System.out.println("parcentage    :" + parcentage);
        String division = (60 <= parcentage) ? "First Division"
      : (parcentage >= 50)? "Second Division ":  (parcentage >= 33) ? "Third division" : " Fail";
        System.out.println("\n"+division);
        if( parcentage>=50){
          System.out.println("\ncongratulation. ");
        }
        else
        System.out.println("Better luck in next time   ");
    }
}
