public class Array20Swaping {
    //Q5. reveser array using swaping methode .
    public static void main(String[] args) {
         int []arr ={ 1,2,3,4,5,6,3};
         int l = arr.length;
         int n = Math.floorDiv(l, 2 );
         int temp;
         for (int i = 0; i < n; i++) {
            // swaping a[i]and [l-1-i]
            // take a temp variable 
            temp =arr[i];
            arr[i]=arr[l-1-i];
            arr[l-1-i]=temp;
            
         }
        for (int elemant : arr) {
            System.out.println(elemant+ " ");
            
        }
    }
    
}
