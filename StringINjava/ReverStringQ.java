package StringINjava;

public class ReverStringQ {
    public static void main(String[] args) {
        String str = "I am an online educator";// space lagne se  wo  pre reverse hogaya . // methode 1
        String ans = "";
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ') {
                sb.append(ch);

            } else {
                sb.reverse();
                ans += sb;
                ans += " ";
                sb = new StringBuilder("");
            }
        }

        sb.reverse();
        ans += sb;

        System.out.println(ans);

    }

}
