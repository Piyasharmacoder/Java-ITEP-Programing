// print all the subsequnce of a sting 

 public class R12 { 
    public static void subsequnces( String str, int index, String newString){
        //bace case 
        if( index== str.length()){
            System.out.println(newString);
            return;
        }
        // recursion call
        char currentchar= str.charAt(index);
        // to be ,jaanaa hai 
        subsequnces(str, index+1, newString +currentchar);
        // to be not be ,nai jaana ho 
        subsequnces(str, index+1, newString);
    }
public static void main(String[] args) {
    String str = "abc";
      subsequnces(str, 0, " ");
}
 }
//Now  time complexity  o(2^n)