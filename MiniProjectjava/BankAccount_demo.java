package MiniProjectjava;

public class BankAccount_demo {
    private double balance;
    private String name;

    public BankAccount_demo(String name) {
        this.name = name;
        balance = 0.0;

    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println(name + " has $" + balance);
    }

    public void withdraw(double amount) {
        if (amount < balance) {
            balance -= amount;
            System.out.println(name + " has $" + balance);
        } else {
            System.out.println("withdrawal by" + name + "fails");
        }
    }

    public void transfer(double amount, BankAccount_demo acc) {
        if (this.balance < amount) {
            System.out.println("Transfer fails ");

        } else {
            this.balance -= amount;
            acc.balance += amount;
            System.out.println("Account of " + this.name + "becomes $" + this.balance);
            System.out.println("Account of " + acc.name + "becomes $ " + this.balance);
        }
    }

    public static void main(String[] args) {
        BankAccount_demo tom = new BankAccount_demo("Tom");
        tom.deposit(500.0);
        BankAccount_demo piya = new BankAccount_demo("piya");
        piya.deposit(200.0);
        tom.transfer(100.0, piya);
        piya.withdraw(200.0);
        System.out.println(piya.getBalance());
        System.out.println(tom.getBalance());

    }
}
