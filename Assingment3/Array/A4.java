package Assingment3.Array;
//
public class A4 {
    public static void main(String[] args) {
        int arr[] ={ 10,20,30,40};
        int  n = 4;
        for( int i = 0; i<n; i++){
            for( int j =0; j<n; j++){
                for( int k = 0; k<n; k++){
                    System.out.println(arr[i]+ ",  " + arr[j]+",  " + arr[k]);
                }
            }
            System.out.println();
        } 
    }  
}
