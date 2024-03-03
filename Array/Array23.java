public class Array23 {
    // Q6. check array Sorted array or not
    public static void main(String[] args) {
        boolean isSorted = true;
        int arr[] = { 1, 2, 3, 5, 6, 7, 8, 9 };
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
                break;
            }
        }
        if (isSorted) {
            System.out.println("This  is  a sorted array .");

        } else {
            System.out.println("This is a not sorted array .");
        }
    }

}
