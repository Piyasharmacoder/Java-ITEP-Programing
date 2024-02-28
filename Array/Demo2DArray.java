public class Demo2DArray { 
    public static void main(String[] args) {
        int [][] flats ;
        flats= new int[2][3];
        flats[0][0] =101;
        flats[0][1] =101;
        flats[0][2] =101;
        flats[1][0] =201;
        flats[1][1] =201;
        flats[1][2] =201;
        //Displyaing the 2D Array 
        System.out.println(" printing the 2D array using  for loop");
        for (int i = 0; i < flats[i].length; i++) {
            for(int j = 0; j<flats[i].length; j++){
                System.out.print(flats[i][j]);
                System.out.println(" ");
            }
           System.out.println(""); 
        } 
    

    }
    
}
