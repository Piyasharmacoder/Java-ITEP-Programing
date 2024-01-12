public class R16 {

    // binary seach question  using recurion ...

    public static int binsearch( int arr[] ,int start , int end ,int traget ){

        // base case 
        if( start>end ){
            return -1;
        }
        // processing 
        // now find mid 
        int mid = start+(end-start)/2;
        if( arr [mid]== traget){
            return mid;
        }
        // baki recursion shambhalega
        if( arr[mid]<traget){
            // rigth me jaao
            start=mid+1;
             return binsearch(arr, start , end, traget);

        }
        else{ // left me jao
            end =mid-1;
            return binsearch(arr, start, end, traget);
        }

    }
    public static void main(String[] args) {
        int arr[]= { 10,20,30,40,50,60,70,80};
        int size = 8; 
        int start = 0;
        int end =  size -1; 
        int traget = 10;
         // function call 
        int foundIndex = binsearch(arr, start, end, traget);
         if( foundIndex !=-1){
            System.out.println(" taget found : "+foundIndex + " Index " ) ;
         }
         else{
            System.out.println("  Index is not found ");
         }
    }
    
}
