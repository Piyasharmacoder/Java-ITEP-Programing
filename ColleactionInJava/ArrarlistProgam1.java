
/*wap to ask 5 names from user and check if particular name exists in array or not */

package ColleactionInJava;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrarlistProgam1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        ArrayList<String> al = new ArrayList<String>(n);
        System.out.println("Enter " + n + " name");
        for (int i = 0; i <= n; i++) {
            String s = sc.nextLine();
            al.add(s);
        }

        System.out.print("Enter search name : ");
        String name = sc.nextLine();
        boolean b = false;
        for (String s2 : al) {
            if (name.equals(s2)) {
                b = true;
            }
        }

        if (b) {
            System.out.println(name + " Exist in array");
        } else {
            System.out.println(name + " does not Exist");
        }
    }
}
