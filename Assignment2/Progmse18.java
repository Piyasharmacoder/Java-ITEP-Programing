import java.util.Scanner;
// wap to find plinadrome number like--121,252,525,111,
public class Progmse18 {

/*public static void main ( String [] args ){
    Scanner sc =new Scanner ( System.in );
    System.out.print(" Enter the number : ");
    int n= sc.nextInt();
    int rev=0,z; // z= orignal numer 
    z=n;
    while( n>0 ){                               // while( num!=0)
        rev= (rev * 10)+n%10;
        n= n/10;
      System.out.println( rev);
    }
    if ( rev==z)
    System.out.println( "palindrome number ");
    else
    System.out.println("Not pailndrome number ");

} */ 
//-------------------------------------------------------------------------------------------------------------//
// print  1to 100 all plaindrome number 
 public static void main(String []args ){
    Scanner sc=  new Scanner( System .in );
    System.out.print("Enter the range of number");
    int num1= sc.nextInt();
    int num2= sc.nextInt();
    for( int i=num1; i<=num2; i++){
        int n=i;
        int rev=0;
        while( n!=0){
        rev= ( rev*10)+n%10;
        n=n/10;
        }
        if ( rev==i){
            System.out.println(i+ " ");
        }
    }

 }
}
