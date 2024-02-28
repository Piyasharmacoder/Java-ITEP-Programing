package StringINjava;
// given a  string s , return the number of pailndrom subString in it 

public class StringQ17 {
    public static void main(String[] args) {
        // ___________________type 1____________________________
        // String str = "abcdcba";
        // StringBuilder gtr = new StringBuilder(str);
        // gtr.reverse();
        // String S = gtr+"";
        // if (str.equals(S)) {
        // System.out.println("Palindrome");

        // }
        // else{
        // System.out.println("not Palindrome ");
        // }

        // ________________-type2 _______________________
        String x = "abcdcba";
        int i = 0;
        int j = x.length() - 1;
        boolean flag = true; // true --> palindrome hai
        while (i < j) {
            if (x.charAt(i) != x.charAt(j)) {
                flag = false;
                break;
            }
            i++;
            j--;

        }
        if (flag == true) {
            System.out.println("palindrome");

        } else {
            System.out.println("not palindrome");
        }
    }

}
