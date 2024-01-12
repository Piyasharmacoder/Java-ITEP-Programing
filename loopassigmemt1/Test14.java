

import java.util.Scanner;

//  Q14 - A shopkeper offers 30% discount  on  purchasing articles whereas  the  other  shopkeper offer
// tow Succesive discount 20% and 10% for purchasing  the same  articles.
// Now WAP in java to compute and display the  discounts.

public class Test14 {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         double price, discount1 ,discount2, rimengprice  , discount3 ;
         System.out.print(" Enter price : ");
         price = in. nextDouble();
         discount1 =30.0/100.0*price;
         discount2 = 20.0/100.0*price;
         rimengprice = price-discount2;
        discount3 = 10.0/100.0*rimengprice;
        System.out.println(" Discount  given by  1st shopker : "+ discount1);
        System.out.println(" Discount given by 2nd shopker :   1st Discount  = " +discount2);
        System.out.println(" Discount given by 2nd shopker :   2st Discount  = " +discount3);
        System.out.println(" Total Discount given by 2nd shopker : " + ( discount2+ discount3));
    }
    
}
