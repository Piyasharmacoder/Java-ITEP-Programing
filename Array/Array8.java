public class Array8 {
    void foundOfArray() {
        int[] arr = { 12, 23, 4, 5, 7, 8, 9, 4, 10 };
        int X = 4;
        int ans = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == X) {
                ans = i;
                break;
            }
        }
        if (ans == -1) {
            System.out.print(" NOt found ");
        }  else {
            System.out.print(" Found " + X + " At index " + ans);
        }

    }

    public static void main(String[] args) {

        Array8 obj = new Array8();
        obj.foundOfArray();

    }

}
