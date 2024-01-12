import java.util.Scanner;
import java.util.jar.Attributes.Name;

import javax.lang.model.util.ElementScanner14;
import javax.swing.plaf.basic.BasicBorders.ToggleButtonBorder;

public class Dmart {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.print(" Name of coustumer : ");
          String name = sc.nextLine();
          System.out.print(" Gender            : ");
          String gender = sc.nextLine();
          System.out.print(" Enter Date        : ");
          String date = sc.nextLine();

          System.out.print("Enter the itme1 : ");
          String itme1 = sc.nextLine();
              
          System.out.print("Enter the itme2 : ");
          String itme2 = sc.nextLine();
              
          System.out.print("Enter the itme3 : ");
          String itme3 = sc.nextLine();
              
          System.out.print("Enter the itme4 : ");
          String itme4 = sc.nextLine();
              
          System.out.print("Enter the itme5 : ");
          String itme5 = sc.nextLine();
              
          System.out.print("Enter the itme6 : ");
          String itme6 = sc.nextLine();
              
          System.out.print("Enter the itme7 : ");
          String itme7 = sc.nextLine();
              
          System.out.print("Enter the itme8 : ");
          String itme8 = sc.nextLine();
              
          System.out.print("Enter the itme9 : ");
          String itme9 = sc.nextLine();
              
          System.out.print("Enter the itme10 : ");
          String itme10 = sc.nextLine();
     

          System.out.print(" Enter the  Quntity1 :");
          int quntity1 =sc.nextInt();
                    
          System.out.print(" Enter the  Quntity2 :");
          int quntity2 =sc.nextInt();

          System.out.print(" Enter the  Quntity3 :");
          int quntity3 =sc.nextInt();
                    
          System.out.print(" Enter the  Quntity4 :");
          int quntity4 =sc.nextInt();

          System.out.print(" Enter the  Quntity5 :");
          int quntity5 =sc.nextInt();

          System.out.print(" Enter the  Quntity6 :");
          int quntity6 =sc.nextInt();
          
          System.out.print(" Enter the  Quntity7 :");
          int quntity7 =sc.nextInt();
           
          System.out.print(" Enter the  Quntity8 :");
          int quntity8 =sc.nextInt();
           
          System.out.print(" Enter the  Quntity9 :");
          int quntity9 =sc.nextInt();

          System.out.print(" Enter the  Quntity10 :");
          int quntity10 =sc.nextInt();
          System.out.print( " Enter the Quntity" );
         
           
           int p1 = 10;
           int p2 = 20;
           int p3 = 30;
           int p4 = 40;
           int p5 = 50;
           int p6 = 60;
           int p7 = 70;
           int p8 = 80;
           int p9 = 90;
           int p10 =100;
             
           int t1 =  quntity1 *p1;
           int t2 =  quntity2 *p2;
           int t3 =  quntity3 *p3;
           int t4 =  quntity4 *p4;
           int t5 =  quntity5 *p5;
           int t6 =  quntity6 *p6;
           int t7 =  quntity7 *p7;
           int t8 =  quntity8 *p8;
           int t9 =  quntity9 *p9;
           int t10 =  quntity10 *p10;
           int totle = t1+t2+t3+t4+t5+t6+t7+t8+t9+t10;
           double gst =  ( totle *10)/100;

           double discount1 , discount5, discount10,  finaltotle, finalitme1;
           if (quntity1>4 )
           finalitme1=t1-( (t1*5)/100);
           else finalitme1=0;
           discount5=( (t5*10)/100);
           discount10 =((t10*15)/100);
           if ( totle > 10000)
           finaltotle=(totle*15)/100+gst;
           else if (( totle>5000)&&( totle<10000))
           finaltotle =(totle*10)/100+gst;
           else {
               finaltotle= totle+gst;
           }

           System.out.println(" Do you want a carry bag answer in the from of yes or not");
           String carry=sc.next();
           if (carry ==" yes")
           finaltotle=finaltotle+10;
          System.out.println(finaltotle);
           



            System.out.print(" \n\n\n\n\n");
          System.out.println(" \t\t\t\t\t D-MART \t\t\t");
          System.out.println(  " Name   : "+  name + " \t\t\t\t\t\t\t\t   Date : " + date);
          System.out.println(  " Gender : "+ gender);
          System.out.println(" ------------------------------------------------------------------------------------------------------");
          System.out.println(" Item Name \t\t Quantity \t\t Price \t\t Totle  \t\t After-Discount ");
          System.out.println(    itme1 + " \t\t\t  " +   quntity1 + "  \t\t\t " +  p1 +" \t\t " + t1 ); 
          System.out.println(    itme2 + " \t\t\t  " +   quntity2 + "  \t\t\t " +  p2 +" \t\t " + t2 );   
          System.out.println(    itme3 + " \t\t\t  " +   quntity3 + "  \t\t\t " +  p3 +" \t\t " + t3 );    
          System.out.println(    itme4 + " \t\t\t  " +   quntity4 + "  \t\t\t " +  p4 +" \t\t " + t4 );   
          System.out.println(    itme5 + " \t\t\t  " +   quntity5 + "  \t\t\t " +  p5 +" \t\t " + t5 );   
          System.out.println(    itme6 + " \t\t\t  " +   quntity6 + "  \t\t\t " +  p6 +" \t\t " + t6 ); 
          System.out.println(    itme7 + " \t\t\t  " +   quntity7 + "  \t\t\t " +  p7 +" \t\t " + t7 );     
          System.out.println(    itme8 + " \t\t\t  " +   quntity8 + "  \t\t\t " +  p8 +" \t\t " + t8 );    
          System.out.println(    itme9 + " \t\t\t  " +   quntity9 + "  \t\t\t " +  p9 +" \t\t " + t9 );   
          System.out.println(    itme10 + "\t\t\t  " +   quntity10 +"  \t\t\t " +  p10+" \t\t " + t10);   
          System.out.println("-------------------------------------------------------------------------------------------------------" );
       }
}
