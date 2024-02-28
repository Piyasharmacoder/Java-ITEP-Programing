package StringINjava;
// agr hume kuch insert krna ho String me to StringBuilder ki help se kr sakte hai
// hum StringBulider ke Methode insert(idx,ch)and deletecharAt(ch) se kuch insert yaa delet kr skte hai .


public class BuilderString3 {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("piyanka");
        System.out.println(str);
        str.insert(1, 'r'); 
        System.out.println(str);

        // now delete
        str.deleteCharAt(5); // n delet
        System.out.println(str);

        // string  ko Reverse krna (i,j)
        System.out.print("\n\nPrint reverse :  ");
        str.reverse(); // use reverse methode 
        System.out.println(str);

        System.out.println( "\n _______________deleted string________________\n");
        // delet i index to j index 

        str.delete(1, 3);
        System.out.println(str);
        
    }
    
}
