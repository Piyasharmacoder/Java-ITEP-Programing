package Assingment3.Array;

public class A5 {
    void sortZeroOne(int arr[], int n) {
        int ZeroCount = 0;
        int OneCount = 0;
        // step A = count 0 and 1. 
        int i;
        for (i = 0; i < n; i++) {
            if (arr[i] == 0)
                ZeroCount++;
              }if (arr[i] == 1)
                OneCount++;
        
       /*  // Step B =place all Zeroes first
        int i;
        for (i = 0; i < ZeroCount; i++) {
            arr[i] = 0;
        }
        // stap b = place all one first
        for (int j = i; j < n; j++) {
            arr[j] = 1;*/  

            // EASY WAY 
            int  index = 0;
             while ( ZeroCount--){
                index++; 
             }
             whlie ( OneCount--){
                arr[index] = 1;
                index++;
             }
        
            }

    public static void main(String[] args)
    {
        int n = 16;
        int arr[] = { 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 0, 0, 0, 0, 0 };
        sortZeroOne(arr, n);

       // printing all the numberr 
       for( int i =0; i<n; i ++){
        System.out.println(arr[i]+" ");
       } 
       System.out.println();
    }
}
