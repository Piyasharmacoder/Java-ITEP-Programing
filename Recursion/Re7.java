// Remove  duplicate in  a string 
public class Re7 { 
    public static boolean  [] map = new boolean[26];

     public static void Removeduplicates( String str , int index , String newString){
        // bse case
        if( index==str.length()){
            System.out.println(newString);
            return;
        }
        char currentchar= str.charAt(index);
        if ( map[ currentchar-'a']==true){
        Removeduplicates(str, index+1, newString);
        }
         else{
            newString+= currentchar;
             map[currentchar-'a'] =true;
             Removeduplicates(str, index+1, newString);
        }

     }
    public static void main(String[] args) {
        String str = "aaabbccddeee  ";
        Removeduplicates(str, 0,"");
        
    }
    
}
