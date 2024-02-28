import java.util.Scanner;

// class Demo1 {
//     public void PrintEven(int value) {
//         int arr[] = new int[value];
//         for (int index = 0; index < arr.length; index++) {
//             if (arr[index] % 2 == 0) {
//                 System.out.println(arr[index]);

//             }

//         }
//     }
// }

public class Array12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        {
            System.out.println("Enter number :");
            int value = sc.nextInt();
            // creation of array
            int arr[]=new int[value];
            // Demo1 obj = new Demo1();
            // obj.PrintEven(value);
            for(int i =0; i<arr.length; i++){
                if (arr[i]%2==0) {
                    System.out.print("Even Number :"+arr[i]);
                    
                }
            }

        }
    }
}
