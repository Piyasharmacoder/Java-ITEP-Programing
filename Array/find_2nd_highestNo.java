//Q1. Declare an array with 10 elements. Get a subarray from an array between index 2 to 6 and find out the 2nd highest number from the sub array.
// sample: Input: 2 4 5 3 6 7 9 4 5 6
// Output:     Sub array: 5 3 6 7 9
//          2nd Highest element: 7

import java.util.Scanner;

public class find_2nd_highestNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int [20];
        System.out.println("Enter the number : ");
        for( int i =0 ; i<=10; i++){
           arr[i]=sc.nextInt();  
        }
    }
    
}
