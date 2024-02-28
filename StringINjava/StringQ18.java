package StringINjava;

public class StringQ18 {
    public static boolean isPalindrome(String S)
     {
        int i = 0, j = S.length() - 1;
        while (i < j){
            if (S.charAt(i) != S.charAt(j)) 
                return false;
                i++;
                j--;
        }
        return true;
     }
    public static void main(String[] args) {
         String str = " abcba";
         int  count  = 0;
         for(int i = 0; i<=str.length(); i++){
            for(int j = i+1; j<=str.length(); j++){
                if(isPalindrome(str.substring(i, j))==true){
                    System.out.print(str.substring(i, j)+ " ");
                    count++;

                }
            }
         }
         System.out.println(" \nThe number of Pailndromic SubString are : "+ count);
        
    }
}