package ExaptionHandling;

import java.io.FileInputStream;

public class E1 {
    public static void main(String[] args) {
       // ___________________________________Compile time Exaptionan cheackde exaption_________________________
       try{
       FileInputStream fis = new FileInputStream("d:/abc.txt");
        
       }
       catch (Exception e) {
        System.out.println(e);
    }
    }
}
