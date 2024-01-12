package Assignment1;

import java.util.Scanner;

public class Program18 {
     public static void main ( String [] ags ){
        byte P,C,M,H,E;
        Scanner sc = new Scanner ( System.in );
        System.out.print(" Enter the physics marsk : "); 
        P = sc .nextByte();
        System.out.print(" Enter the physics marsk : "); 
        C = sc .nextByte();
        System.out.print(" Enter the physics marsk : "); 
        M = sc .nextByte();
        System.out.print(" Enter the physics marsk : "); 
        H = sc .nextByte();
        System.out.print(" Enter the physics marsk : "); 
        E = sc .nextByte();
        float avrg = (P+C+M+H+E)/5.0f;
         System.out.print(" total percentage  is : " + avrg );
         if( avrg>=40 && P>=33&& C>=33 && M>=33 && H>=33 && E>=33){
            System.out.println("Congratulation, you  have  pass ");
         } else 
         System.out.println(" you are not pass plsea try agine : ");
     }
}
