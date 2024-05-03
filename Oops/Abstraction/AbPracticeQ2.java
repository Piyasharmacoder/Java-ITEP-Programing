package Abstraction;

// Write a Java program to create an abstract class BankAccount with abstract methods deposit() and withdraw(). 
// Create subclasses: SavingsAccount and CurrentAccount that extend the BankAccount class and
//  implement the respective methods to handle deposits and withdrawals for each account type.

abstract class BanckAccount {
    private String name;
    private int accountNumber;
    private double balance;

    // private String accountType;
    // create constructor
    public BanckAccount(String name, int Ac, double balance) {
        this.name = name;
        this.accountNumber = Ac;
        this.balance = balance;
    }

    // create getter and setter
    public String getName() {
        return name;
    }

    public int getaccountNo() {
        return accountNumber;
    }

    public double getbalance() {
        return balance;
    }

    public String setName(String name) {
        this.name = name;
        return name;
    }

    public int setAccountNo(int account) {
        this.accountNumber = account;
        return accountNumber;
    }

    protected double setbalance(double balance) {
        this.balance = balance;
        return balance;
    }

    // cerate a abstract method
    abstract void deposit(double amount);

    abstract void withdraw(double amount);
}

class SavingsAccount extends BanckAccount {
    // create a constructor
    public SavingsAccount(String name, int accountNumber, double balance) {
        super(name, accountNumber, balance);

    }

    // overderived deposit method
    @Override
    public void deposit(double amount) {
        setbalance(getbalance() + amount);
        
        System.out.println();
        System.out.println("Deposit  of $ " + amount
                + "has been successfully added to your Account .Currentbalance $ : " + getbalance());
                System.out.println(getName() + " has Current Amount : " + getbalance());

    }

    @Override
    public void withdraw(double amount) {
        if (amount < getbalance()) {
            setbalance(getbalance() - amount);
            System.out.println();
            System.out.println("Withdrawal  of $ " + amount + "has been successfull.Currentbalance $ : " + getbalance());
            System.out.println(getName() + " has current Amount : " + getbalance());


        } else {
            System.out.println("withdrawal by" + getName() + "fails");
            System.out.println("Currentbalance $ : " + getbalance());

        }

    }
}

class CurrentAccount extends BanckAccount {

    // create a constructor
    public CurrentAccount(String name, int accountNumber, double balance) {
        super(name, accountNumber, balance);

    }

    // overderived deposit method
    @Override
    public void deposit(double amount) {
        setbalance(getbalance() + amount);
        System.out.println(getName() + " has $" + getbalance());
        System.out.println("Deposit  of $ " + amount  + "has been successfully added to your Account .Currentbalance $ : " + getbalance());

    }

    // override the withdraw method
    public void withdraw(double amount) {
        if (amount < getbalance()) {
            setbalance(getbalance() - amount);
            System.out.println();
            System.out.println("Withdrawal  of $ " + amount + "has been successfull.Currentbalance $ : " + getbalance());
            System.out.println(getName() + " has Current Amount : " + getbalance());


        } else {
            System.out.println("withdrawal by" + getName() + "fails");
            System.out.println("Currentbalance $ : " + getbalance());
        }

    }
}

public class AbPracticeQ2 {
    public static void main(String[] args) {
        BanckAccount obj1 = new SavingsAccount("Priya", 12345, 1000);
        obj1.deposit(1000);
        obj1.withdraw(500);
        BanckAccount obj2 = new CurrentAccount("Priya", 12345, 1000);
        obj2.deposit(1000);
        obj2.withdraw(500);

    }
}
