/**
 * Array6
 */
public class Array6 {

    void multiArrays() {
        // int [][][] arr = new int[2][2][2]; //2*2*2=8
        int[][] arr = { { 2, 3, 5, }, { 7, 8, 9, }, { 1, 3, 5,  } };
        System.out.println(arr[0][0]);
        System.out.println(arr[0][1]);
        System.out.println(arr[0][2]);
           System.out.println();

        System.out.println(arr[1][0]);
        System.out.println(arr[1][1]);
        System.out.println(arr[1][2]);
        System.out.println();

        
        System.out.println(arr[2][0]);
        System.out.println(arr[2][1]);
        System.out.println(arr[2][2]);
        
    }

    public static void main(String[] args) {
        Array6 obj = new Array6();
        obj.multiArrays();

    }

}
