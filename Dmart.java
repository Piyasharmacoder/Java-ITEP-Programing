import java.util.Scanner;
import java.util.jar.Attributes.Name;

import javax.lang.model.util.ElementScanner14;
import javax.swing.plaf.basic.BasicBorders.ToggleButtonBorder;

//A person enter in a D-Mart mall for the shopping. He is first
// time visiting the D-mart mall. 
// He/She has to purchase 10 items.

// System should ask for the name of the customer and Gender.

// User will tell you the item name and quantity of each product
// purchased one by one.

// You have to calculate the total bill amount on the following 
// Criteria basis

//  on first product purchase if quantitiy greater then
//  4 then you have to offer 5% discount on total price of that product

//  on 5th product purchase you have to offer 10% discount on total
//  price.

//  on 10th product purchase you have to offer 15% discount on total
//  price of that product. 

//  let suppose the cost of 1st product is 10
//  cost of 2nd product is 20
//     .
//     .
//  cost of 10th product is 100;

//  if Total Bill amount is greater then 10000 then you have
//  to offer 15% of total bill amount
//  if total Bill amount is between 5000 and 10000 then 
//  you have to offer 10% of total bill amount

//  Also 10% GST of total Bill Amount

//  Then you have to ask for carry bag to customer
//  if he/she yes then add 10 rupees in total bill amount.

//  if the customer is female then you have to gift a Cadeberry
//  If the customer is male then you have to gift a Ladger Wallet

//  Develop a Java Application to Generate the Bill in 
//  Following Format

//   D-Mart
//    Name : Cheeku Sing			Date: 12/9/2022
//    -----------------------------------------------------------
//    Item Name	Quantity    Price	Total   After-Discount		                      
//      Item-1	   5	      10        50 Rs       47.5 Rs
//      Item-2	   3	      20	    60 RS       60.0 RS	
//        .
//        .
//        .
//        .
//        .
//        .
//        .
//      Item-10	  20        100         2000       300.0 Rs
//    ----------------------------------------------------------
//                                         A.P	    D.P	
//                                         45000	    43500 
//      Gift :- Cadeberry                  0.00	    0.00

//      Carry Bag : yes                    10:00	    10:00
//      GST (10%)	                        450         450
//    ---------------------------------------------------------
//                                         45460       43960 RS

//                        Thank You
//                         To Visit
//                          D-Mart                 

//    ----------------------------------------------------------  

public class Dmart {
  // public static void main(String[] args) {
  // Scanner sc = new Scanner(System.in);
  // System.out.print(" Name of coustumer : ");
  // String name = sc.nextLine();
  // System.out.print(" Gender : ");
  // String gender = sc.nextLine();
  // System.out.print(" Enter Date : ");
  // String date = sc.nextLine();

  // System.out.print("Enter the itme1 : ");
  // String itme1 = sc.nextLine();

  // System.out.print("Enter the itme2 : ");
  // String itme2 = sc.nextLine();

  // System.out.print("Enter the itme3 : ");
  // String itme3 = sc.nextLine();

  // System.out.print("Enter the itme4 : ");
  // String itme4 = sc.nextLine();

  // System.out.print("Enter the itme5 : ");
  // String itme5 = sc.nextLine();

  // System.out.print("Enter the itme6 : ");
  // String itme6 = sc.nextLine();

  // System.out.print("Enter the itme7 : ");
  // String itme7 = sc.nextLine();

  // System.out.print("Enter the itme8 : ");
  // String itme8 = sc.nextLine();

  // System.out.print("Enter the itme9 : ");
  // String itme9 = sc.nextLine();

  // System.out.print("Enter the itme10 : ");
  // String itme10 = sc.nextLine();

  // System.out.print(" Enter the Quntity1 :");
  // int quntity1 = sc.nextInt();

  // System.out.print(" Enter the Quntity2 :");
  // int quntity2 = sc.nextInt();

  // System.out.print(" Enter the Quntity3 :");
  // int quntity3 = sc.nextInt();

  // System.out.print(" Enter the Quntity4 :");
  // int quntity4 = sc.nextInt();

  // System.out.print(" Enter the Quntity5 :");
  // int quntity5 = sc.nextInt();

  // System.out.print(" Enter the Quntity6 :");
  // int quntity6 = sc.nextInt();

  // System.out.print(" Enter the Quntity7 :");
  // int quntity7 = sc.nextInt();

  // System.out.print(" Enter the Quntity8 :");
  // int quntity8 = sc.nextInt();

  // System.out.print(" Enter the Quntity9 :");
  // int quntity9 = sc.nextInt();

  // System.out.print(" Enter the Quntity10 :");
  // int quntity10 = sc.nextInt();
  // System.out.print(" Enter the Quntity");

  // int p1 = 10;
  // int p2 = 20;
  // int p3 = 30;
  // int p4 = 40;
  // int p5 = 50;
  // int p6 = 60;
  // int p7 = 70;
  // int p8 = 80;
  // int p9 = 90;
  // int p10 = 100;

  // int t1 = quntity1 * p1;
  // int t2 = quntity2 * p2;
  // int t3 = quntity3 * p3;
  // int t4 = quntity4 * p4;
  // int t5 = quntity5 * p5;
  // int t6 = quntity6 * p6;
  // int t7 = quntity7 * p7;
  // int t8 = quntity8 * p8;
  // int t9 = quntity9 * p9;
  // int t10 = quntity10 * p10;
  // int totle = t1 + t2 + t3 + t4 + t5 + t6 + t7 + t8 + t9 + t10;
  // double gst = (totle * 10) / 100;

  // double discount1, discount5, discount10, finaltotle, finalitme1;
  // if (quntity1 > 4)
  // finalitme1 = t1 - ((t1 * 5) / 100);
  // else
  // finalitme1 = 0;
  // discount5 = ((t5 * 10) / 100);
  // discount10 = ((t10 * 15) / 100);
  // if (totle > 10000)
  // finaltotle = (totle * 15) / 100 + gst;
  // else if ((totle > 5000) && (totle < 10000))
  // finaltotle = (totle * 10) / 100 + gst;
  // else {
  // finaltotle = totle + gst;
  // }

  // System.out.println(" Do you want a carry bag answer in the from of yes or
  // not");
  // String carry = sc.next();
  // if (carry == " yes")
  // finaltotle = finaltotle + 10;
  // System.out.println(finaltotle);

  // System.out.print(" \n\n\n\n\n");
  // System.out.println(" \t\t\t\t\t D-MART \t\t\t");
  // System.out.println(" Name : " + name + " \t\t\t\t\t\t\t\t Date : " + date);
  // System.out.println(" Gender : " + gender);
  // System.out.println(
  // "
  // ------------------------------------------------------------------------------------------------------");
  // System.out.println(" Item Name \t\t Quantity \t\t Price \t\t Totle \t\t
  // After-Discount ");
  // System.out.println(itme1 + " \t\t\t " + quntity1 + " \t\t\t " + p1 + " \t\t "
  // + t1);
  // System.out.println(itme2 + " \t\t\t " + quntity2 + " \t\t\t " + p2 + " \t\t "
  // + t2);
  // System.out.println(itme3 + " \t\t\t " + quntity3 + " \t\t\t " + p3 + " \t\t "
  // + t3);
  // System.out.println(itme4 + " \t\t\t " + quntity4 + " \t\t\t " + p4 + " \t\t "
  // + t4);
  // System.out.println(itme5 + " \t\t\t " + quntity5 + " \t\t\t " + p5 + " \t\t "
  // + t5);
  // System.out.println(itme6 + " \t\t\t " + quntity6 + " \t\t\t " + p6 + " \t\t "
  // + t6);
  // System.out.println(itme7 + " \t\t\t " + quntity7 + " \t\t\t " + p7 + " \t\t "
  // + t7);
  // System.out.println(itme8 + " \t\t\t " + quntity8 + " \t\t\t " + p8 + " \t\t "
  // + t8);
  // System.out.println(itme9 + " \t\t\t " + quntity9 + " \t\t\t " + p9 + " \t\t "
  // + t9);
  // System.out.println(itme10 + "\t\t\t " + quntity10 + " \t\t\t " + p10 + " \t\t
  // " + t10);
  // System.out.println(
  // "-------------------------------------------------------------------------------------------------------");
  // }

  // _________________________________________________________type
  // 2_________________________________________________________________________________

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Customer Name : ");
    String name = sc.nextLine();
    System.out.print("Enter Date : ");
    String date = sc.nextLine();
    System.out.print("Enter Gender m or f: ");
    char gender = sc.next().charAt(0);
    System.out.print("Enter the Items number : ");
    int n = sc.nextInt();
    int a[] = new int[n];
    for (int i = 0; i < a.length; i++) {
      System.out.print("Item no." + (i + 1) + " : ");
      a[i] = sc.nextInt();
    }
    System.out.println("Enter the Item Quantity : ");
    int b[] = new int[n];
    for (int i = 0; i < b.length; i++) {
      System.out.print("Quantity of Item no." + (i + 1) + " : ");
      b[i] = sc.nextInt();
    }
    int p[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
    int t1 = p[0] *  b[0];
    int t2 = p[1] * b[1];
    int t3 = p[2] * b[2];
    int t4 = p[3] * b[3];
    int t5 = p[4] * b[4];
    int t6 = p[5] * b[5];
    int t7 = p[6] * b[6];
    int t8 = p[7] * b[7];
    int t9 = p[8] * b[8];
    int t10 = p[9] * b[9];
    double a1 = (t1 * 5) / 100;
    double a5 = (t5 * 10) / 100;
    double a10 = (t10 * 15) / 100;
    double d1 = (b[0] >= 4) ? (t1 - a1) : t1;
    double d2 = t2;
    double d3 = t3;
    double d4 = t4;
    double d5 = (t5 - a5);
    double d6 = t6;
    double d7 = t7;
    double d8 = t8;
    double d9 = t9;
    double d10 = (t10 - a10);
    int ap = (t1 + t2 + t3 + t4 + t5 + t6 + t7 + t8 + t9 + t10);
    double dp = (d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + d10);
    String gift = (gender == 'm') ? "Leadger wallet" : (gender == 'f') ? "Cadeberry" : "Sorry";
    System.out.println();
    System.out.print("Do you want a carry bag y or n: ");
    char bag = sc.next().charAt(0);
    String carrybag = (bag == 'y') ? "Yes" : (bag == 'n') ? "No" : "sorry";
    double cb = (bag == 'y') ? (10.00) : (0.00);
    double gst = (ap * 5) / 100;
    double total = (ap + cb + gst);
    double td = (dp + cb + gst);
    System.out.println("\n\n");
    System.out.println(" D-Mart ");
    System.out.println("Name : " + name + " " + "Date : " + date);
    System.out.println("-------------------------------------------------------------");
    System.out.println("Item Name " + "Quantity " + "Price " + "Total " + "After-Discount");
    System.out.println("Item-" + a[0] + "\t\t " + b[0] + "\t " + p[0] + " \t" +  t1 + " \t" + d1);
    System.out.println("Item-" + a[1] + "\t\t " + b[1] + "\t " + p[1] + " \t" + t2 + " \t" + d2);
    System.out.println("Item-" + a[2] + "\t\t " + b[2] + "\t " + p[2] + " \t" +
        t3 + " \t" + d3);
    System.out.println("Item-" + a[3] + "\t\t " + b[3] + "\t " + p[3] + " \t" +
        t4 + " \t" + d4);
    System.out.println("Item-" + a[4] + "\t\t " + b[4] + "\t " + p[4] + " \t" +
        t5 + " \t" + d5);
    System.out.println("Item-" + a[5] + "\t\t " + b[5] + "\t " + p[5] + " \t" +
        t6 + " \t" + d6);
    System.out.println("Item-" + a[6] + "\t\t " + b[6] + "\t " + p[6] + " \t" +
        t7 + " \t" + d7);
    System.out.println("Item-" + a[7] + "\t\t " + b[7] + "\t " + p[7] + " \t" +
        t8 + " \t" + d8);
    System.out.println("Item-" + a[8] + "\t\t " + b[8] + "\t " + p[8] + " \t" +
        t9 + " \t" + d9);
    System.out.println("Item-" + a[9] + "\t\t " + b[9] + "\t " + p[9] + " \t" +
        t10 + " \t" + d10);
    System.out.println("-------------------------------------------------------------");
    System.out.println(" " + "A.P " + "D.P");
    System.out.println(" " + ap + " " + dp);
    System.out.println("Gift : " + gift + " 0.00 " + " 0.00");
    System.out.println("Carry Bag : " + carrybag + " " + cb + " " + cb);
    System.out.println("GST (10%)" + " " + gst + " " + gst);
    System.out.println("-------------------------------------------------------------");
    System.out.println(" " + total + " " + td);
    System.out.println(" Thank You ");
    System.out.println(" To Vist ");
    System.out.println(" D-Mart ");
    System.out.println("-------------------------------------------------------------");
  }
}

// __________________________________________________________________________________________________________________________________________
