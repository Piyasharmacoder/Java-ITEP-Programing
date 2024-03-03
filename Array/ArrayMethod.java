import java.util.Arrays;
import java.util.Scanner;

public class ArrayMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array");
        int size = sc.nextInt();
        int siezarray[] = new int[size];
        System.out.println("Enter the data in array");
        for (int i = 0; i < siezarray.length; i++) {
            siezarray[i] = sc.nextInt();

        }
        System.out.println("Print sorted array. ");
        Arrays.sort(siezarray);
        for (int i = 0; i < siezarray.length; i++) {
            System.out.println(siezarray[i]);

        }

    }

}
