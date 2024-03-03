public class Arra22 {
    //// find the minmum and maximum element in this array suing for each loop.
    public static void main(String[] args) {
        int arr[] = { 1, 3, 4, 6, 778, 46,-3 };
        // createva variable to store minimum element
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];

            }
            if (arr[i] < min) {
                min = arr[i];

            }

        }
        System.out.println("The Maximum element in array : "+ max);

        System.out.println("The Minimum element in this aray : " + min);

    }

}
