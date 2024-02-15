package Trickyprogma;

public class Tricky11 {
    public static void main(String[] args) {
        int x = 10;
        if (x++ > 9 && x++ != 10 || x++ > 11 || ++x>x||++x>13 ) {
            System.out.println("x :" +x);
        } else {
            System.out.println("x : "+ x);
        }

    }

}
