package Multithreding;
// User thread
class UserThread extends Thread{
    public void run() {
        // task for thread 

        System.out.println("User Defind thread is running");
    }
}

public class ThreadOPreation {
    public static void main(String[] args) {

        System.out.println("Program start at time  : ");
        int x = 35 + 56;
        System.out.println("Sum : " + x);
        // ye method btayega ki es waqt yah per kon sa thread run ho raha hai
        Thread t = Thread.currentThread();
        String tName = t.getName(); // ye method thread ka batayega
        System.out.println("Current Running Thread Name is : " + tName + "\n");

        // now Change the Thread Name ,Rename the Thread Name, set the Thread Name use
        // setName() method
        t.setName("MyThreadMain");
        System.out.println("Name of Current Running Thread is : " + t.getName());

        // agar hum chahate hai ki humra Thread 5 minutes /yaa seconds ke Sleep ho jaaye
        // sleep condition me chala jaye to hum Sleep ()methode ka or break() methode
        // kause kr sakte
        // Thread sleep methode ek static methode hai
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
        };


        // getId() methode to find thread id 
        System.out.println("Current runinig Thread Id NUmber : "+t.getId());
        System.out.println("Program End at time : \n");

        // going to start user defined thread
        //  crate and call user thread object 
        UserThread thread = new UserThread();
        thread.start();


    }

}