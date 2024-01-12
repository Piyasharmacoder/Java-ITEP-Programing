package Assingment3;

public class prten38 {
    public static void main(String[] args) {
        int i, j;
        for (i = 6; i >= 1; i--) {
            for (j = 1; j <= i; j++) {
                if (i % 2 == 0)
                    System.out.print(j);
                else {
                    int k = ((i + 1) - j);
                    System.out.print(k); // hum yaha aise bhi likh skhte hai s.o.p(( i+1)-j); me ...
                }
            }
            System.out.println();
        }
    }

}
