package Thread;

class mythread extends Thread {
    // CREATE constructor
    public mythread(String name) {
        super(name);

    }

    // CREATE run method
    public void run() {
        int i = 45;
        System.out.println("Thank you");
    }
}

public class Thread_practie1 {
    public static void main(String[] args) {
        mythread t = new mythread("piya");
        mythread t2 =  new mythread("Raj thakur");

        t.start();
        t2.start();
        System.out.println("The id  of the thread t is  : " + t.getId());
        System.out.println("The name of the thread t is : " + t.getName());
        System.out.println("the priority of the thread t is  : " + t.getPriority());
        System.out.println("Context class loder  : " +t.getContextClassLoader());
        System.out.println("thrad state : "+t.getState());
        System.out.println("thread class :  "+ t.getClass());
        System.out.println("thrad gruop : "+t.getThreadGroup());
        System.out.println("thread uncaugth exception : "+t.getUncaughtExceptionHandler());
        System.out.println("thread stack trace : "+t.getStackTrace());
        System.out.println("___________________________________________________________________________________________\n\n");
 
        System.out.println("Name of the thread t2 : " + t2.getName());
        System.out.println("Thread  id  t2 : " + t2.getId());
    }

}
