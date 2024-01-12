package Basicprogram.operators.Airthmetical;

class ID {

    public static void main(String[] args) {
        int x, y; 
        float  z;
        x = 5;
        y = 2;
        z = ++x - y++ * --y / x++;
        System.out.println(z);
    }
}
 