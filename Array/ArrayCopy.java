import java.util.Arrays;
import java.util.Scanner;

public class ArrayCopy {
    // public static void main(String[] args) {
    // // intialize array 1
    // int arr1[] = { 1, 3, 4, 5, 6, 7, };
    // // create array 2 with the size of array1
    // int arr2[] = new int[arr1.length];
    // // now copying all elemnt to array1 into array2
    // for (int i = 0; i < arr1.length; i++) {
    // arr2[i] = arr1[i];

    // }
    // // displye element of array 1
    // System.out.println("Element of Original array : ");

    // for (int i = 0; i < arr1.length; i++) {
    // System.out.print(arr1[i] + " ");

    // }
    // System.out.println();

    // /// Displaying elements of array2

    // System.out.println("Elements of new array or copyed array: ");
    // for (int i = 0; i < arr2.length; i++) {
    // System.out.print(arr2[i] + " ");

    // }

    // }




    // type 2 copy all element in array

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter the size of array : ");
    //     int size = sc.nextInt();
    //     int array1[] = new int[size];
    //     int array2[] = new int[size];
    //     System.out.println("Enter the data in  original array ");
        
    //     for (int i = 0; i < array1.length; i++) {
    //         array1[i] = sc.nextInt();
    //     }
    //     System.out.println("original  or First array element .");
    //     for (int i = 0; i < array1.length; i++) {
    //         System.out.print(array1[i] + " ");
    //     }
    //     System.out.println();

    //     System.out.println("copy or Second array element .");
    //     for (int i = 0; i < array2.length; i++) {
    //         array2[i] = array1[i];
    //         System.out.print(array2[i] + " ");
    //     }

    // }


    // copy of using Arrays.copy methode 

    public static void main(String[] args) {
        int[] a = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Data of array1 .");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
            
            
        }
        int [] b= Arrays.copyOf(a, 5);
        System.out.println(" copy  data in array2 .");
        for (int i = 0; i < a.length; i++) {
            System.out.print(b[i]+" ");
            
        }
    }
}