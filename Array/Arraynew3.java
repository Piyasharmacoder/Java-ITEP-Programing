// WAP to print duplicate elemnts in the  array 
//broutfroce approch 

import java.util.Scanner;

public class Arraynew3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array :");
        int values = sc.nextInt();
        System.out.println("Enter the value of array : ");

        // array creation 
        int arr[] = new int[values];
        for (int i = 0; i < values; i++) {
            arr[i] = sc.nextInt();
        }

        // logic
        System.out.println("Dublicate element are : ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                }
            }
        }

    }

}
