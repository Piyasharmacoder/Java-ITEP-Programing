package Trickyprogma;

import java.util.Scanner;

class tricky{
    public void Demo( int x){
        if( x++!=10||x++>11){
            System.out.println("X : "+ x);
        }
        else{
            System.out.println(x);

        }

    }
}

public class Tricky13 {
 
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print(" Enter the number : ");
        int x = Sc.nextInt();
        tricky obj = new tricky();
        obj.Demo(x);



    }
}
