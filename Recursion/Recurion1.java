/// print 1to 5 using recursion

public class Recurion1 {
    public static void printnumber(int n) {

        // base case
        if (n == 6) {
            return;
        }

        // processing 
       System.out.println(n);
          //printnumber(n+1);

        // recursion call
       printnumber(n + 1);
       //System.out.println(n);    // aise bhi likh sakte hai  
    }

    public static void main(String[] args) {
        System.out.println(" print number :");
        int n = 1;
        printnumber(n);// n=1

    }

}
