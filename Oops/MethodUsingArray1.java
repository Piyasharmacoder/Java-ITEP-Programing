import java.util.Scanner;
// find the Smallest value using methode in array 

public class MethodUsingArray1 {
    public static void findSmallestNum(double a, double b, double c) {
        double[] arr = new double[] { a, b, c };
        double min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println(" The Smallest value is  : " + min);
    }

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print(" please Enter the  values a : ");
        double a = Sc.nextDouble();
        System.out.print(" please Enter the  values b : ");
        double b = Sc.nextDouble();
        System.out.print(" please Enter the  values c : ");
        double c = Sc.nextDouble();
        // call the methode in main mathode
        findSmallestNum(a, b, c);
    }

}
