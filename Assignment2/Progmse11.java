import java.util.Scanner;
// wap to print this serise 2,5,10,17,26--------------------------------------n.//
// wap to sum of the serise 2+5+10+17+26+---------------------------------------------n+n//
public class Progmse11 {
    public static void main(String args[]){
        Scanner Sc = new Scanner( System .in );
        System.out.print (" Enter the number :");
        int n = Sc.nextInt();  
       // int sum = 0;
        for(  int i=1; i< n ; i++){
           // sum =sum+ i*i+1;
            System.out.print (i *i +1 +" + ");
        }
       // System.out.println("\n ="+ sum );
    } 
    
}
