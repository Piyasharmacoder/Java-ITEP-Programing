import java.util.Scanner;

public class Triangle {
  /*  public static void main(String args[]){
 
    float area;
    int h= 10;
    int b= 15;
    area=(float)((h*b)/2);
    System.out.println("area of triangle:"+area);
} 
*/
//-----------------------------------------------------------------------------//
// wap to find the parimeter of a trigangls //

public static void main ( String []args ){
Scanner sc=new Scanner (System.in);
System.out.print("Enter the vlaue of a = ");
int a = sc.nextInt();
System.out.print("Enter the value of b = ");
int b = sc.nextInt();
System.out.print("Enter the value of c = ");
int c = sc.nextInt();
int area;
area = ( a+b+c);
System.out.println("perimeter of triangle : " + area );
}
}
