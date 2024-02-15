//  WAP to Sort the array  asending order and  desending order

import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter the length of the  array: ");
        int value = sc.nextInt();
        System.out.println(" Enter the values of unsorted array: ");
        // cration of array
        int[] arr = new int[value];
        for (int i = 0; i < value; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(" -------------------Approch-1 using loops logic------------------------------------");
        // logic
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) { // using lese then "<"sing to decending order
                    int temp = arr[i]; // using swaping methode
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }
        }
        System.out.println(Arrays.toString(arr));



        System.out.println(" ------------------------Approch-2 to sort the array using predefine method-------------------------- ");
        // without logic how can sorted the array " using arrays predifine methode in
        // claas avalival the java .util  Arrays pack "
        // predifine  sort methode
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

    }

}
