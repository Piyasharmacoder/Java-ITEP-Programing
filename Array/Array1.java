

import java.util.Scanner;

 class Array1 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print(" Enter the values : ");
        int size = Sc.nextInt();
        int numbers[] = new int[size];
        // input
        for (int i = 0; i < size; i++) {
            numbers[i] = Sc.nextInt();
        }
        int x = Sc.nextInt();

        // output
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == x) {
                System.out.println(" X found at indax : " + i);
            }
        }
    }

}