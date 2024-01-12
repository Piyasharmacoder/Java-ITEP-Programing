import java.util.Scanner;

public class Methode7 { 
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print(" Enter the value of X  : ");
        int X = Sc.nextInt();
        System.out.print(" Enteer the value of y : ");
        int Y = Sc.nextInt();
        System.out.print(" Enter the value of  Z : ");
        int Z = Sc.nextInt();
        // methode call 
        System.out.println(" The smallest value is : "+ Smallest(X, Y, Z) +" \n");
      

    } 
    // methode create 
    static int Smallest( int X, int Y, int Z){
        
     return Math.min(Math.min(X, Y), Z); 
   
    }
    
}
