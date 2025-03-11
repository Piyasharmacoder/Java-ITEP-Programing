
// find the perfact number of the series 

import java.util.Scanner;

public class progrm2 {
    // public static void main(String[] args) {
    // int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 28 };
    // int count = 0;

    // for (int i = 0; i < arr.length; i++) {
    // int num = arr[i];
    // int sum = 0;
    // for (int j = 1; j < num; j++) {
    // if (num % j == 0) {
    // sum += j;
    // }

    // }

    // if (sum == num) {
    // count++;
    // System.out.println(num + " : This is a perfact No ");

    // }
    // }
    // System.out.println("Total perfact Numbers of : " + count);
    // }
    // _______________________________________________________________________________________________________________________//

    // print all perfact numbers

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Range of numbers : ");
        int n = sc.nextInt();

        for (int i = 1; i <=n; i++) {
          if(isperfactNumber(i)){
            System.out.println(i+",");
          }
        }
    }
    public static boolean isperfactNumber(int num) {
        int sum = 0;
        for(int i =1; i<num;i++){
            if(num% i==0){
                sum+=i;
            }
        }
        return sum==num;
}
}