 
// print  keypad combination 

 public class R14 {
    public static String[]keypad={ ".", "abc", "def", "ghi","jkl","mno","pqrs"," tu"," vwx","yz"};
    public static void printcombination( String str, int index,String combination ){
        // bse case 
        if( index== str.length()){
            System.out.println(combination);
            return;
        }
        char currentchar= str.charAt(index);
        String mapping =keypad[currentchar-'0'];
        for( int i=0; i<mapping.length(); i++ ){
            printcombination(str, index+1, combination+mapping.charAt(i));

        }
    }
    public static void main(String[] args) {
    System.out.println("combination of any  key number : ");
       String str= "25" ;
       printcombination(str, 0, " ");
    }
    
}
