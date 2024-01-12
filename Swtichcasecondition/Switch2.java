package Swtichcasecondition;

import java.util.Scanner;

public class Switch2 {  
    public static void main(String[]args ){
        Scanner sc= new Scanner( System.in);
        System.out.print(" Enter the names :");
        String ch = sc.nextLine();
        switch (ch){
            case " priyanka" :
            System.out.println("she is IAS officer "  );
            break;
            case " piya":
            System.out.println("she is also softerwere Engineer ");
            break;
            case" Mamta":
            System.out.println(" she is a SDM officer ");
            break;
            case " Goldi ":
            System.out.println( " she is famous Docter ");
            break;
            case" Muskan":
            System.out.println(" she is a  become a advocate ");
            break;
            default:
            System.out.println(" invalid string ");
            break;   
        }
    } 
}
