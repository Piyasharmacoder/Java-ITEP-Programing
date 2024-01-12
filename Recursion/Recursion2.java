
// print sum of frist n natrual  number 
public class Recursion2 {
    // make function
    public static void printSum(int i, int n, int sum) {

        // base case
        if (i == n) {
            sum += i;
            System.out.println(sum);
            return;
        }
        // processing 
        sum = sum + i;
        // next level ke liye call lagya printsum ko
        // recursion call
        printSum(i + 1, n, sum);

    }

    public static void main(String[] args) {
        System.out.println("Sum of number :");
        // function ko call kiya

        printSum(1, 5, 0);
    }

}
