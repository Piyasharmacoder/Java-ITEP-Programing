package ClassInJava;

import java.util.Scanner;



public class StudentClass {
// property
 String name  = "P  iya ";
 int roll_No =10;
 int marks1 =85, marks2 = 69, marks3 =98;

 // behaviour 
 int getMarks(){
    return  marks1+marks2+marks3;  

 }void getGreads(){
    System.out.println("Student with  roll no " + roll_No+ " Secured A grade  ");
 }
 

    public static void main(String[] args) {
        // Scanner sc= new Scanner(System.in );
        // System.out.println("Enter the name of Student : ");
        
     StudentClass piya = new StudentClass();
      System.out.println(piya.getMarks());
      piya.getGreads();
       System.out.println(piya.marks1);
       System.out.println(piya.marks2);
       System.out.println(piya.marks3);
       System.out.println(piya.name);
       System.out.println(piya.roll_No);
    }
    
}
