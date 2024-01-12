

import java.util.Scanner;
//  calculate the sum of  all  the  element in the  array 

public class Array5 {

    void sumofArray() {
        int[] arr = { 1, 2, 3, 4, 5 };
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Array5 obj = new Array5();
        obj.sumofArray();
    }
}
