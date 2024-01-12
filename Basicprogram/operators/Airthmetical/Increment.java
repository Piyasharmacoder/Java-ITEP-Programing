package Basicprogram.operators.Airthmetical;

public class Increment {  
   /*  public static void main(String[]args)
{
     int a=5;
     int  b =8;
     int c= a++ + --b;
     System.out.println(c);
}*/
//----------------------------------------------------------------------------------------------------------------------//
/*public static void main  (String []args ){
     int x = 5;
     int y= 4;
     x+=y;
     System.out.println(x);
     y-=x;
     System.out.println(y);
}*/
//------------------------------------------------------------------------------------------------------------//
public static void main(String [] args){
    int x= 10;
    int y= 20;
    int z= 5;
    x-=y+=z;
    System.out.println("x ="+ x);
    y+=x-z;
    System.out.println("y ="+ y);
    z-=x+=y;
    System.out.println("z ="+ z);
} 
}