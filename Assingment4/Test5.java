package Assingment4;
// "integer.parseInt "ka use hum string ko int me convert karne ke liye krte hai 
// but eski conditionhai ki string me only digit honi chaiye agr digit ke alwa kuch or hoga to ye "  Number Fromt Exception massge ka ERoRR "dega 

public class Test5 {
    public static void main(String[] args) {
        String s1 = "10";
        String s2 = "20";
        int x = Integer.parseInt(s1);
        int y = Integer.parseInt(s2);
        System.out.println(s1 + s2); // output = 1020
        System.out.println(x + y); // output = 30

    }

}
