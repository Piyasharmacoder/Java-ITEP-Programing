public class R17 {
    public static void findSubSequnce(String str , String output, int index ){
        // base case 
        if( index>= str.length()){
            // ans jo h ,vo output string me bulid ho chuka hoga
            // print krdo 
            System.out.println(output);
            return;
        }
        char ch = str[index];
        //exculude
        findSubSequnce(str, output, index+1);
        //inculde
        // output string me ch character ko  inculde krdo 
    }
    public static void main(String[] args) {
        
    }

    
}
