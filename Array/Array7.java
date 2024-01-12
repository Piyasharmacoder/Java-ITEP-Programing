
// find the maximum value of the given array 

public class Array7 {
    void maxOfArray() {
        int[] arr = { 10, 4, 5, 6, 38, 9, 1 };
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > ans) {
                ans = arr[i];
            }
        }
        System.out.println("  Max Element  : " + ans);

    }

    public static void main(String[] args) {
        Array7 obj = new Array7();
        obj.maxOfArray();

    }

}
