public class Array21 {
    // find the maxmimum element in this array suing for each loop.
    public static void main(String[] args) {
        int arr []={ 1,3,4,6,778,46};
        //createva variable to store max element 
        int max = 0; 
        for (int elemant : arr) {
            if (elemant>max) // cheack maximum
            {
             max =elemant; // store maximum   
            }
            
        }
        System.out.println("The Maximum element in this aray : "+max);
            
    }
}
