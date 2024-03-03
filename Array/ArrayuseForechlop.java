public class ArrayuseForechlop {
    // Traversing the array elements

public static void main(String[] args) {
    // declaring an array  
    int array []= { 12,24,45,56,78,90};
    int sumofarr =0;
    ///traversing the array the help of  for-each loop  
    for (int i : array) {
        System.out.println(i);

        sumofarr =sumofarr+i;
    }
    System.out.println("Sum of array element : "+sumofarr);


    
}
    
}
