package Assingment3;

import java.util.Scanner;

class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int a[][] = new int[4][];
    System.out.println("Total Rows: " + a.length);
    System.out.println("Enter the number of column in each row");
    for (int i = 0; i < a.length; i++) {
      int cols = sc.nextInt();
      a[i] = new int[cols];
    }
    System.out.println("Enter the data");
    for (int i = 0; i < a.length; i++) {
      System.out.println("Enter the data in row" + i + 1);
      for (int j = 0; j < a[i].length; j++) {
        a[i][j] = sc.nextInt();
      }
    }
    System.out.println();
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[i].length; j++) {
        System.out.print(a[i][j]);
      }
      System.out.println();
    }

   int[][] = new int[2][4];
    a[0] = new int[1];
    a[1] = new int[2];
    a[2] = new int[3];
    a[3] = new int[4];

  }
}
