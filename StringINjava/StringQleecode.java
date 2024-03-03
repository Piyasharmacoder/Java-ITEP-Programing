package StringINjava;

// Q. The string should be compressec such that consencutive duplicate of  character of are 
// replaced with the character and followed by  the number  of  consencutive duplicate.
// input --> aaabbbbccddde
//output --> a3b4c2d3e
// find the fycuncy
public class StringQleecode {
    public static void main(String[] args) {
        String str = "aaabbbbccdddeeef";
        String ans = " " + str.charAt(0);
        int count = 1;

        // now use for loop
        for (int i = 1; i < str.length(); i++) {
            char cuurent_char = str.charAt(i);
            char previous_char = str.charAt(i - 1);
            if (cuurent_char == previous_char) {
                count++;

            } else {
                if (count > 1)
                    ans += count;
                count = 1;
                ans += cuurent_char;
            }
        }
        if (count > 1)
            ans += count;
        System.out.println(ans);
    }

}