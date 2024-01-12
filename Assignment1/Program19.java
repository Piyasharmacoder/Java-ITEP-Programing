package Assignment1;

import java.util.Scanner;

public class Program19 {
    public static void main(String[] ags) {
        Scanner sc = new Scanner(System.in);

        String subject[] = { "Physics", "Chemistry", "Maths", "Hindi", "English" };
        int marks[] = new int[5];
        int sum = 0;
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Enter " + subject[i] + " marks");

            marks[i] = sc.nextInt();
            if (marks[i] <= 100 && marks[i] >= 0) {
            } else {
                while (marks[i] > 100 || marks[i] < 0) {
                    System.out.println("Invelid marks plese re Enter");
                    marks[i] = sc.nextInt();
                }
            }

            sum = sum + marks[i];
        }
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] >= 33) {
                System.out.println(subject[i] + " PASS\n");
            } else {
                System.out.println(subject[i] + " FAIL\n");
            }
        }

        int percent = 0;
        System.out.println("TOTAL : " + sum);
        percent = sum / 5;
        System.out.println("Percent :" + percent + "%");
        
        }
    }
