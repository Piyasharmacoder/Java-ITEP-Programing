package Assingment4;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers of itme purches");
        int n = sc.nextInt();
        sc.nextLine();
        int s = 100;
        int total = 0;
        int discount = 0;
        int sum[] = new int[n];
        String item[] = new String[n];
        int unit[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter Item name " + (i + 1) + ": ");
            item[i] = sc.nextLine();
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Enter unit of item no. " + (i + 1) + ": ");
            unit[i] = sc.nextInt();
            sum[i] = (s * unit[i]);
        }
            System.out.println("Name" +  "\t" + "unit" + "\t" + " Price " + "\t" + "Total");
        for (int i = 0; i < n; i++) {
            System.out.println(" " + item[i] + "\t" + unit[i] + "\t" + "100" + "\t" + sum[i]);
            total = total + sum[i];

        }
        System.out.println("Total amount : " + total);
        if (total > 1000) {
            discount = (total-(total / 10));
            System.out.println("After discount 10%: " + discount);
        }
    }
}
