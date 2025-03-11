import java.util.Scanner;

public class Array15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get the number of students from the user
        System.out.print("Enter the number of students: ");
        int numberOfStudents = sc.nextInt();
        sc.nextLine(); // Consume newline character

        // Arrays to store student information
        String[] names = new String[numberOfStudents];
        int[] age = new int[numberOfStudents];
        int[] rollno = new int[numberOfStudents];
        double[] marks = new double[numberOfStudents];

        // Input student information
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("\nEnter information for Student " + (i + 1) + ":");



            System.out.print("NAME: ");
            names[i] = sc.nextLine();
            System.out.print("Age:");
            age[i]=sc.nextInt();
            System.out.print("ROLL NUMBER: ");
            rollno[i] = sc.nextInt();
            System.out.print("FINAL MARKS: ");
            marks[i] = sc.nextDouble();
            sc.nextLine(); 
        }

        // Display student data information
        System.out.println("\nStudent Information Table :");
        System.out.println("\n S.no  \t\tStudent Name  \t\tAge  \t\tRoll Number  \t\tFinal Marks ");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("\n " + (i + 1) + ".\t\t" + names[i] + "\t\t\t" + age[i]+"\t\t\t" +rollno[i] + "\t\t\t" + marks[i]);

            // System.out.println("Name: " +names[i]);
            // System.out.println("Roll-No: " +rollno[i]);
            // System.out.println("Marks: " +marks[i]);
            // }

            // Closed scanner
            sc.close();
        }
        
    }
}