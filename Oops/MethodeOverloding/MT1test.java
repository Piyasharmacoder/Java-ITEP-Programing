package MethodeOverloding;

public class MT1test {
       void shwo( int a )
      {

        System.out.println("1");

      }

      void shwo (int a,int b)
       {
         System.out.println("2");

   
        }

      void shwo( String a)
      {

        System.out.println("3");

      }


public static void main(String[] args)
        {
        MT1test t = new MT1test();
            t.shwo(1 ,56 );
            t.shwo("piya");
        }
}





