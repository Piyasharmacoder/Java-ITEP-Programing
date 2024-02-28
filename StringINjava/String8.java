package StringINjava;

import java.util.Scanner;

public class String8 {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the  string : ");
        String str = sc.nextLine();
        String str1 = str.substring(4); // beginINdex batayega 
        System.out.println("\n"+str1);


        String str2 = str.substring(2,4); // beginINdex  or ending  dono batayega 
        System.out.println("\n"+str2);
    }
    
}
