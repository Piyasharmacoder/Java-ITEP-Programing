package Multithreding;

class myThread implements Runnable {
    public void run() {
        // task for thrad
        for (int i = 1; i <= 10; i++) {
            System.out.println("value of i is : " + i);
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }

}

// another thread  class 

class myAnotherThread extends Thread {
    public void run() {
        // task for thrad
        for (int i = 10; i >= 1; i--) {
            System.out.println("Another thread is i : " + i);
            try {
                Thread.sleep(2000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }

}
public class THRED {
    public static void main(String[] args) {
        myThread mt = new myThread();
        Thread t1 = new Thread(mt);
        t1.start();
        
        // another  thread
        myAnotherThread t2 = new myAnotherThread();
        t2.start();
       


    }

}