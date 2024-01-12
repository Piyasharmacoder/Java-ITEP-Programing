
// print number from 5to 1 
public class R1 {
    // function banya
    public static void printnumber(int n) {
        // base case
        if (n == 0) {
            return;
        } 
        // processing 
        System.out.println(n);
        // khud ko call kiya
        //recursion call
        printnumber(n - 1);
    }
// main class 
    public static void main(String[] args) {
        int n = 5;
        // functoin ko call kiya
        printnumber(n);// with n=5
    }

}
