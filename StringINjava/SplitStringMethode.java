package StringINjava;

// String Split methode 
// string Split method ka use Sentence me se  word ko nikalne ke liye krte haai 
// split methode Sentence ko tood deta hai array  me  
public class SplitStringMethode {
    public static void main(String[] args) {

        String str = " Who is this? This is a cat, She is very Beautiful!";

        // Sentence me se word ko nikalne ke liye baics fromula

        // now written the logic to take out word from the sentance

        // str= str+" ";
        // last word ke baad sapce ke liye but
        // jab humare sentect ke last me . , ? yya koi or syamble ho to humko ye line
        // use nai krni haii

        String word;
        int start = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == ' ' || c == '.') {
                word = str.substring(start, i);
                start = i + 1;
                System.out.println(word);
            }

        }

        // ________________________________________NOW USING SPLIT METHODE
        // ________________________________________________________________________

        System.out.println(
                "\n_________________________________________Split Methode ____________________________________________\n");

        String arr[] = str.split("[ ,.!?]"); // single delimiter dena to hum double costs ke ander aise de sakte hai (" .")
        //                                       lekin jab mulitple delimiter dena hot hum double costs ke ander squer barket me aise dete ("[ ,.!?]")

        for (int i = 0; i < arr.length; i++) {

            if (arr[i].length()>0)

             // gar humri  word ka length greaterthen 0 hai  means waha koi  chiz present hai tab hum usko print karege wrna nai 
            //  or gar humne ye conditon nai lagi to in word ke bich symbols ka ek extra space ptint karega  
            
           
            System.out.println(arr[i]);
        }

    }

}
