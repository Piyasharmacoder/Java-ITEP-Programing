public class Array18 {
    //Q1. print the floting array and sum of array .
    public static void main(String[] args) {
        float array []= {10.2f,20.3f,10.5f, 40.10f,50.1f};
        float sumofarr =0;
        for (float f : array) {
            System.out.println(f);
            sumofarr = sumofarr+f;   
        }
        System.out.println("Sum of floting arr : "+ sumofarr);
    }
    
}
