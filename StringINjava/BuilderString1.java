package StringINjava;
// String  problem -> Intereninig hai, --> immutability rakhni paditi  -->Poor Perforamnce hai 
// than eliye hum StringBuilder ka use krte taki humari Performance Shudhar jaye esme immutability naa rahe .



public class BuilderString1 {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("hello");
        str .append("world"); // use append function to add string 
        System.out.println(str);
    }
    
}
