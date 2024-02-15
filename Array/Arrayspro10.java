
// WAP to merge two arrays into single array

import java.util.Arrays;

public class Arrayspro10 {
    public static void main(String[] args) {

        int[] arr1 = { 1, 2, 3, 4 }; // length =4
        int[] arr2 = { 5, 6, 7, 8 }; // length= 4
        int[] sum = new int[arr1.length + arr2.length]; // sum =8
        for (int i = 0; i < arr1.length; i++) {
            sum[i] = arr1[i];
        } // stroge here ={ 1,2,3,4,0,0,0,0}

        for (int i = 0; i < arr2.length; i++) {
            sum[i + arr1.length] = arr2[i];
        } // stroge here= { 1,2,3,4,5,6,7,8}

          System.out.println(Arrays.toString(sum));        
        
    } 
   

}
