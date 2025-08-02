//5. Write a program to implement synchronized method and synchronized block.
package java_practical_list1;
class BankAccount {
    private int balance = 1000;

    public synchronized void withdraw(int amount) {
        System.out.println("Trying to withdraw " + amount);
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining: " + balance);
        } else {
            System.out.println("Not enough balance.");
        }
    }

    public void deposit(int amount) {
        synchronized (this) {
            balance += amount;
            System.out.println("Deposited: " + amount + ". Total: " + balance);
        }
    }
}

public class SyncDemo {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();

        Thread t1 = new Thread(() -> acc.withdraw(700));
        Thread t2 = new Thread(() -> acc.deposit(500));

        t1.start();
        t2.start();
    }
}