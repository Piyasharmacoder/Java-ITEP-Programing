// how to cerate a thread 
// we can 2  types of threads create  
// " 1.using extended class" & 2. using " " implementing Runnable interface ""

package Multithreding;
class MythredTest1 extends Thread // step 1
{
    // step 2 override the run() method
    public void run() 
    {
         System.out.println("by using extends class ");  // task of the thread write

    }
}

//2. using" implementing Runnable interface "
  class myThreadtest1  implements Runnable
  {
    public void run()
    {
            System.out.println("Runnable  implements");
    }
  }


public class mythred {
    public static void main(String[] args) {
        MythredTest1 test1 = new MythredTest1(); // step 3 create an object of thread class 
        test1.start();   // step 4 call or invock the thread
     //________________________________________________________________________________________________________________//

       myThreadtest1 test2 = new myThreadtest1();
       Thread t1= new Thread(test2);
       t1.start(); 

    }

}
