package StringINjava;
// agr hume kisi index me kuch replace yaa change  krna ho to  hum String bulider ka 

// SetcharAt(idx,ch)and append(ch) methode ka use karege .

public class BuliderString2 {

    public static void main(String[] args) {

        StringBuilder str = new StringBuilder("Piya");
        System.out.println(str);
        // muje piya se --> Siya krna hai to.
        str.setCharAt(0, 'S');
        System.out.println(str);


        str.append(" Sharma is 19 year old." );
        System.out.println(str);

    }

}
