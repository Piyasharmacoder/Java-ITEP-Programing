package StringINjava;
// print  only uppercase character of string 

import java.util.Scanner;

public class StringQue20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in );
        System.out.print("Enter the character : ");
        String up = sc.nextLine();
        for (int i = 0; i <up.length(); i++) {
            char c1 = up.charAt(i);
            if(Character.isUpperCase(c1)){
                System.out.println(c1);


            }
            
        }
    }

    
}
