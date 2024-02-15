// we can traverse an array in below ways 
// for loop
// for each loop
//  and using strems 

import java.util.stream.Stream;

public class Arraynew {

    public static void main(String[] args) {
        // creating array
        String[] names = { " piya ", " riya ", " siya ", " Ram " };

        System.out.println(" --------------------Approch-1-----------------------");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);

        }

        System.out.println(" --------------------Approch-2------------------------");
        for (String name : names) {
            System.out.println(name);

        }
        System.out.println("--------------------Approch-3--------------------------");
        Stream.of(names).forEach(name -> System.out.println(name));
        


        //print the array in backword direction
        
        System.out.println(" ----------------------Reverse Order--------------------");
        for(int i =names.length-1;i>=0;i--){
            System.out.println(names[i]);

        }
    }



}
