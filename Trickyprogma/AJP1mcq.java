
class Rose {

    public static void main(String args[]) {

        int x, y, k;
        y = 3;

        label:

        for (x = 0; x < y; x++) {

            for (k = 0; k < 2; k++) {

                if (x == k) {

                    continue label;

                }

                System.out.println(x + " and " + k);

            }

        }

    }

}
