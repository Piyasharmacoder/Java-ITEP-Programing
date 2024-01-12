
// check array is shorted or not 
public class R15 {
    public static boolean checkSorted(int arr[], int size, int index) {
        // base case
        if (index >= size) {
            return true;
        }
        // processing
        if (arr[index] > arr[index - 1]) {
            // aage check karna padega ab
            // ab recurssion shambhalega
            boolean aagekaAns = checkSorted(arr, size, index + 1);
            return aagekaAns;
        } else {
            // it means recurion sorted nai hai then return false
            return false;
        }

    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 10, 70, 80, 100 };
        int size = 8;
        int index = 1;
        boolean isSorted = checkSorted(arr, size, index);
        if (isSorted) {
            System.out.println(" Array is sorted : ");
        } else {
            System.out.println(" Array is not sorted : ");
        }

    }
}
