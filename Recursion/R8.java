
// find  the 1st & last couccurance of an elemnent in String 

public class R8 {
    public static int frist = -1; //  now insilization invailid value both fast and last index 
    public static int last = -1;  //  invaild value 

    public static void findOcureance(String str, int index, char elemnent) {
        if (index == str.length()) {
            System.out.println(frist);
            System.err.println(last);
            return;
        }
        char currentchar = str.charAt(index);
        if (currentchar == elemnent) {
            if (frist == -1) {
                frist = index;
            } 
            else {
                last = index;
            }
        }
        findOcureance(str, index+1, elemnent);
    }
    public static void main(String[] args) {
        String str = "adaacdaefaahaa";
        findOcureance(str, 0, 'a');
    }

}
