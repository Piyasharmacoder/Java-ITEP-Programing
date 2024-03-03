import java.util.Scanner;

public class Conditional_Pro {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Name  of Student : ");
        String name = sc.nextLine();

        System.out.print("Enter the Age of Student   : ");
        int age = sc.nextInt();

        System.out.print("Enter the Marks of Student : ");
        double marks = sc.nextDouble();
        if ((age > 17) && (age < 21) && (marks >= 80)) // condition 1: age is greater then 17 and smaller then 21
        {

            // if (marks>=80) // condition 2: marks is greate then 80% // ye condition uper wale if me bhi de sakte hai 
            // {


            System.out.println(name + " is Eligiable to  the loan. ");

            // }
            // else{
            // System.out.println(name +" is Not Eligiable to the loan "); // dont need 
            // }

        }
        
        else {
            System.out.println(name + " is  Not Eligiable to  the loan");
        }

    }

}
