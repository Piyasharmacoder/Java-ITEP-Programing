package StringINjava;
// agr hume String ko yaa uske Characters ko chage krna ho Starting se end se bich me to hum subssting ka use kr skte hai 

public class AddString17 {
    public static void main(String[] args) {
        String  X = "Hello";

        // changing methode 1
        String y = "Dello";
        y = "Sello";
        System.out.println(y);
        System.out.println(X);

       // method 2
       // Helyo
       X =X.substring(0, 3)+'y'+X.substring(4);
       System.out.println(X);
        
    }
     
}
