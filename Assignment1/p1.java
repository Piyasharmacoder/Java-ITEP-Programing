package Assignment1;
import java.util.Scanner;

public class p1 {
public static int calculateProduct( int a, int b){
    return a*b;
}
    public static void main( String [] args ){
        Scanner Sc = new Scanner(System .in  );
        int a =Sc.nextInt();
        int b =Sc.nextInt();
        System.out.println(" product of 2 number : " + calculateProduct ( a,b));
    }
}

    
