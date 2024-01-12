import java.util.HashSet;

public class R13 {

    // now print all the unique{ {jo repeat naa hoti ho } subsequence of a String
    // using recursion

    public static void uniquesubsequnces (String str , int index , String newString ,HashSet<String> set ){
        //base case
        if( index== str.length()){
            if( set.contains(newString)){
                return;
            }
            else{
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }

        // recurion call 
        char currentchar  = str.charAt(index);
        // to be 
        uniquesubsequnces(str, index+1, newString+ currentchar, set);
        // tobe or not be 
        uniquesubsequnces(str, index+1, newString, set);
    }

    public static void main(String[] args) {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        uniquesubsequnces(str, 0, " ", set);
    }
}