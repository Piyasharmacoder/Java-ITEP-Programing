import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MoveAction;

public class R11 {
    // move of all 'x ' to the end of the string using recursion
    public static void Movealltext(String str, int index, int count, String newString) {
        // base case
        if (index == str.length()) {
            for( int i=0; i<count; i++)
            newString+='x';

            System.out.println(newString);
            return;
        }
        // recursion relation
        char currentchar = str.charAt(index);
        if (currentchar == 'x') {
            count++;
            Movealltext(str, index + 1, count, newString);

        } else {
            newString += currentchar;
            Movealltext(str, index + 1, count, newString);
        }
    }

    public static void main(String[] args) {
        String str = "aaxbxxxfdx";
    Movealltext(str, +1, 0, " ");
    }
}
// time complexity o(n)