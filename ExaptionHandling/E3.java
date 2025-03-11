package ExaptionHandling;

import java.util.Scanner;





public class E3 {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        try{
            arr[6]= 10/0;
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage()); 

        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());

    }

}}
