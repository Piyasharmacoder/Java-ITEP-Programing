
public class R10 {
    // check if an array is sorted ( string increasing ) using recursion
    public static boolean isSorted(int arr[], int index) {
        // base case
        if (index == arr.length - 1) {
            return true;
        }
        if (arr[index] >= arr[index + 1]) {
            // array is sorted till now

            // in case of unsorted array 
            //return false;

            return isSorted(arr, index + 1);
        } else {
            return false;
            
            //  return isSorted(arr, index + 1);

        }
    }
    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 6, 2,1 };
        System.out.println("Is sorted array : " + isSorted(arr, 0));
    }

}
