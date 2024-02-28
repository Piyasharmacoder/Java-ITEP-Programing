package StringINjava;
// Substring (i j)and SubString(j)

// SubString is a Countinuous part of a String.like tha 
// String str = " abcd "; is String 
// now ( a,ab,abc,abcd, || b, bc , bcd, || c ,cd || d ) this is countiunous substring of "abcd"                   

public class StringSub14 {
    public static void main(String[] args) {
        String str = "abcde";
        System.out.println(str.substring(0, 5));
        System.out.println(str.substring(2));
        System.out.println("\n\n");

        // substring print using for loops
        for (int i = 0; i < 5; i++) {
            System.out.println(str.substring(i));

        }
        System.out.println("\n___________________ print revesr string________________________  \n");

        for (int j = 5; j > 0; j--) {
            System.out.println(str.substring(j));

        }

    }
}