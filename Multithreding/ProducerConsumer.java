package Multithreding;

class Company {

    // create a variable
    int n;
    // f = false hai to Chance = Producer ki
    // f = true hai to chance = Consumer ki
    boolean f = false;
    // create methode one Producer_items
    // humne producer_items ko synschronized bana diya hai taki jab tak producer es
    // produce iteme ko produce kr raha yaa chala rha hoga tab tak yah koi usme
    // interfaire
    // naa kr paapye

    synchronized public void Producer_items(int n) throws InterruptedException {
        if (f) {
            wait();
        }
        this.n = n;
        System.out.println("Data Produce ho chuka hai : " + this.n);
        f = true;
        notify();
    }

    // create methode two Consumer_items
    // esi tahra jab comsumer item ko consume kr raha hoga tab us case me hume es
    // synschronized bana hoga kuki jab comsumer chal raha hoga to producer na chal
    // paaye

    synchronized public int Consumer_items() throws InterruptedException {
        if (!f) {
            wait();

        }
        System.out.println("Data consume ho chuka hai : " + this.n);
        f = false;
        notify();

        return this.n;

    }
}

class Producer extends Thread {
    // create company class object
    Company c;

    // create a constructor
    Producer(Company c) {
        this.c = c;
    }

    // create a run method
    public void run() {

        // use while loop for infinty loop
        int i = 1;
        while (true) {
            try {
                this.c.Producer_items(i);
            } catch (InterruptedException e) {
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            i++;
        }
    }
}

class Consumer extends Thread {
    // create company class object
    Company c;

    // create a constructor
    Consumer(Company c) {
        this.c = c;
    }

    // create a run method
    public void run() {

        // use while loop for infinty loop
        int i = 1;
        while (true) {
            try {
                this.c.Consumer_items();
            } catch (InterruptedException e) {
            }

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
            }
            i++;

        }

    }
}

public class ProducerConsumer {
    public static void main(String[] args) {
        // create company class object
        Company Com = new Company();

        // call producer and consumer methods
        Producer p = new Producer(Com);
        Consumer c = new Consumer(Com);
        p.start();
        c.start();
    }
}
