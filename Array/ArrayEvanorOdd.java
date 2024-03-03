import java.util.Scanner;

public class ArrayEvanorOdd {
    // print only even number .
    static void EvenNumber(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0)

                System.out.println(arr[i]);
        }

    }

    // now print with evenindex of arr.
    static void EvenIndexOfArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                System.out.println(arr[i]);

            }
        }
    }

    // now print even and odd number in the array .
    static void checkEvenorOddNo(int[] arr) {
        System.out.println("This Number is even .");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) { // cheack the even number
                System.out.println(arr[i]);
            }

        }
        System.out.println("This number is odd .");
        for(int i=0;i<arr.length;i++){
            if (arr[i]%2!=0) {
                System.out.println(arr[i]);
                
            }
        }

    }

    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter the range of value :");
        // int value = sc.nextInt();
        // int [] arr = new int[value];

        int[] arr = { 1, 3, 4, 5, 7, 8, 9, 10, 11, 12 };
        System.out.println("Print only Even number:");
        EvenNumber(arr);

        // object2 call
        System.out.println("\nPrint only Even index:");
        EvenIndexOfArray(arr);
        System.out.println("\nprint Even or odd number .");
        checkEvenorOddNo(arr);

    }

}
