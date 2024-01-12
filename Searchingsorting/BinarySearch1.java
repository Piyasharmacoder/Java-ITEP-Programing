
package Searchingsorting;

public class BinarySearch1 {

    /*
     * public static int binarysearch(int arr[], int n, int target) {
     * int start = 0;
     * int end = n - 1;
     * int mid = (start + end) / 2;
     * while (start <= end) {
     * if (arr[mid] == target) {
     * return mid;
     * } else if (target < arr[mid]) {
     * start = mid + 1;
     * } else if (target > arr[mid]) {
     * end = mid - 1;
     * }
     * mid = (start + end) / 2;
     * }
     * return -1;
     * 
     * }
     * 
     * // public static void main(String[] args) {
     * BinarySearch1 ob = new BinarySearch1();
     * int arr[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };
     * int target = 20;
     * int n = arr.length;
     * int ansIndex = binarysearch(arr, n, target);
     * if (ansIndex == -1) {
     * System.out.println(" Element is not  found ");
     * } else {
     * System.out.println(" Element is found : " + ansIndex);
     * }
     * }
     */

    // --------------------------------------------------------------------------------------//
    // Itreative mathod -------------------------//

    int binarysearch(int arr[], int target, int start, int end) {
        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (target < arr[mid]) {
                start = mid + 1;
            } else if (target > arr[mid]) {
                end = mid - 1;
            }
            // update mid
        }
        return -1;
    }

    public static void main(String[] args) {
        BinarySearch1 ob = new BinarySearch1();
        int arr[] = { 10, 20, 30, 40, 50, 70, 80, 90, };
        int n = arr.length;
        int target = 70;
        int result = ob.binarysearch(arr, target, 0, n - 1);
        if (result == -1) {
            System.out.println(" Element Not found ");
        } else
            System.out.println(" Element found at index : " + result);
    }

}
