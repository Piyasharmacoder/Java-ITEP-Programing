
//Q6 print X^n ( stack height = n )
public class R4 {
    public static int calcPower( int x, int n ){
        // base case 
        if( n==0){  // stap 2 chaek conditon 
            return 1;
        }
        if( x==0){
            return 0;
        }
        // prossing 
         int xPowernminus1 = calcPower(x, n-1);        // step 1                             // x=2, n=5-1=4 = 16 
         int xPowern = x *xPowernminus1;         // stap 3                                 // x=2, n=4-1 =3 = 8
         return xPowern;                                                                  // x=2, n=3-1 = 2 = 4
    }                                                                                     // x=2, n=2-1 = 1 = 2
    public static void main(String[] args) {                                             //  x=2, n=1-1 = 0 = 1 // jaise hi n ki value 0 ho gai   
        int x =2, n=8;                                                                    //  to yaha par hum reach kr gaye  apana bse case 
        int ans = calcPower(x, n);                                                       
        System.out.println( ans);                                                         
        
    }
    
}
