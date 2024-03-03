package BerakCountiun;

public class Continu {
    public static void main(String[] args) {
        // Break and Continu using loop !

        // for (int i = 0; i <= 5; i++) {
        // if (i == 2) {
        // System.out.println("Ending the loop ");
        // continue;
        // }
        // System.out.println(i);

        // }

        // using do whlie looop.

        int i = 0;
        do {
            i++;
            if (i == 3) {
                System.out.println("Ending the loop .");
                continue;

            }

            System.out.println(i);
            // continue;              // continu ka sue yaha bi kr skte hai 

        } while (i < 5);
        System.out.println("loop is end. ");

    }
}