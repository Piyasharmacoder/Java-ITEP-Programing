package Backtracking;

public class Back1 {
    public static void printPermutatoin(String str, String perm, int index) {
        if (str.length() == 0) {
            System.out.println(perm);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char currentchar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            printPermutatoin(newStr, perm + currentchar, index + 1);
        }

    }

    public static void main(String[] args) {
        String str = "ABC";
        printPermutatoin(str, "", 0);
    }

}
