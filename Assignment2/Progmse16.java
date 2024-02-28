import java.util.Scanner;
// wap to print the serise of the number 1-2+3-4+5-6+7-8+9-10 ---------------------------------------------------n//
public class Progmse16 {
    public static void main( String [] args){
        Scanner sc=new Scanner(System .in);
        System.out.print("Enter the number :" );
        int n=sc.nextInt();
        int sum=0;
        for( int i=1; i<=n; i++ ){
            if(i%2!=0)
            System.out.print(i+" - ");
         if ( i%2==0)
            System.out.print(i + " + ") ;
            sum =sum +i;
        }
        System.out.println( " \nSum of the serise  =  " + sum  );
    } 
    
}
