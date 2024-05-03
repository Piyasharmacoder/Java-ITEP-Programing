package StringINjava;

// function or method of indexof 

public class String6 { 
    public static void main(String[] args) {
    String s1 = new String("Computer");
    int  i = s1.indexOf('p'); // indexOf(int ch)
    System.out.println("index is : " + i);

    int j = s1.indexOf('m',3); // indexOf(int ch, int fromlndex)
    System.out.println("index is : " + j);

    int a = s1.indexOf("put");// indexOf(String str)
    System.out.println("Index is : " + a);

    int b = s1.indexOf("put",3);// indexOf(String str, int fromIndex)
    System.out.println("Index is : " + b);


    int c = s1.lastIndexOf('m'); // lastIndexOf(int ch)
    System.out.println("index is : " + c);


    int d = s1.lastIndexOf('m' , 5); // lastIndexOf(int ch ,int fromIndex)
    System.out.println("index is : " + d);
      

    int e = s1.lastIndexOf("mp" ); // lastIndexOf(string str)
    System.out.println("index is : " + e);


    int f = s1.lastIndexOf("mp" ,1); // lastIndexOf(string str)
    System.out.println("index is : " + f);



    
    }
}
