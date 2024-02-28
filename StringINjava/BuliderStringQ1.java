package StringINjava;
// vey importent case 

import java.util.Scanner;

public class BuliderStringQ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        StringBuilder str = new StringBuilder(sc.nextLine());
        System.out.println("____________________________Before toggle___________________________\n");
        System.out.println(str);
        // toggle case
        // PHysiCs se --> phYSIcS krna hai
        for (int i = 0; i < str.length(); i++) {
            // P -->p
            // pehle check krna hoga -->alphabet --> small hai yaa --> Capital
            boolean flag = true; // true means hai yaha ki alphabet pelele se capital letter hai
            char ch = str.charAt(i);
            if (ch == ' ')
                continue;
                

            int asci = (int) ch;
            if (asci >= 97)
                flag = false; // smaall

            if (flag == true) { // capital
                asci += 32;
                char bh = (char) asci;
                str.setCharAt(i, bh);
            

            } else { // samll
                asci -= 32;
                char bh = (char) asci;
                str.setCharAt(i, bh);
            }

        }
        System.out.println("_______________________________After toggle_______________________________\n ");
        System.out.println(str);
    }

}
