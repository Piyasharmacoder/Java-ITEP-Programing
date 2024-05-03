
// 15) Create a class MathOperation containing method ‘multiply’ to calculate
// multiplication of following arguments.
// two integers
// three float
// all elements of array
// one double and one integer

import java.util.Scanner;

class MathOperation2 {

    // methode 1 for multiplye two integer values
    public int multiply(int a, int b) {
        return a * b;
    }

    // methode 2 for multiplye three float values
    public float multiply(float a, float b, float c) {
        return a * b * c;
    }

    // methode 3 for multiplye all elments of array
    public int multiply(int[] arr) {
        int result = 1;
        for (int num : arr) {
            result = result *= num;
        }
        return result;
    }

    // methode 4 for multiplye ek double value element or ek integer vlaue element
    public double multiply(double a, int b) {
        return a * b;
    }

}

public class OopsTest6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MathOperation2 obj = new MathOperation2();

        // take a inpute for two intege values
        System.out.print("Enter the value of  a  : ");
        int A = sc.nextInt();
        System.out.print("Enter the value of  b  : ");
        int B = sc.nextInt();
        int result1 = obj.multiply(A, B);
        System.out.println("Result of  multiplye of two integr value  :  " + result1);

        // take input for three float values
        System.out.print("\n\nEnter the value of C : ");
        float c = sc.nextFloat();
        System.out.print(" Enter the value of  d : ");
        float d = sc.nextFloat();
        System.out.print("Enter the value of e : ");
        float e = sc.nextFloat();
        float result2 = obj.multiply(c, d, e);
        System.out.println("Result of multiplye of three float values : " + result2);

        // take input for all element in aray
        System.out.print("\n\nEnter the size of array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter " + size + " integer ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int result3 = obj.multiply(arr);
        System.out.println("Multipliction of all element in the array : " + result3);

        // take input for one double and one integer
        System.out.print("\n\nEnter the value of  f : ");
        double f = sc.nextDouble();
        System.out.print("Enter the value of g  : ");
        int g = sc.nextInt();
        // double result4 = obj.multiply(f, g);
        System.out.println("Multiplication of one double and one integer : " + obj.multiply(f, g) + "\n");

    }

}
