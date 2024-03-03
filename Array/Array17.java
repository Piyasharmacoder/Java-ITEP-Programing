public class Array17 {
    // print the Square root of each array element.
    static void printSquarrootofarr(int[] array) {
        System.out.println("Print only Squar root .");
        for (int i = 0; i < array.length; i++) {
            System.out.println( Math.sqrt(array[i]));
        }
 
    }

    public static void printcubaroot(int[] array) {
        System.out.println("print only Cube root .");
        for (int i = 0; i < array.length; i++) {
            System.out.println( Math.pow(array[i], 3));
        }

    }

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        printSquarrootofarr(array);
        // methode 2 calll
        printcubaroot(array);

    }

}
