// claculate X^n ( stack ki  height = logn  rakhana hai ).

//( logn mamorey kam consume krta hai that,s reason humari jo algorithm hai wo optimize hai  )

public class R5 {
    public static int calculatepower(int x, int n) {

        // base case
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        // if n is even 
        if ( n%2==0 ){
            return calculatepower(x, n/2)* calculatepower(x, n/2);
        } 
        else{ // if n is odd 
            return calculatepower(x, n/2)* calculatepower(x, n/2 )*x;
        }
    }
    public static void main(String[] args) {
        int x = 2 , n =5;
        int ans = calculatepower(x, n);
        System.out.println(ans);

    }

}
