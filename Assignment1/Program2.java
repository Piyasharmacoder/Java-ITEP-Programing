 /* WAP to find the smallest numbers  */

 package Assignment1;

public class Program2 {
    public static void main(String []args){
        int a =12;
        int b=23;
        int c= 5;
        int x= ( a<b)? a:b;
        int min =( x<c)? x:c; 
        System.out.println("Smallest number is :" + min);
    }
}
