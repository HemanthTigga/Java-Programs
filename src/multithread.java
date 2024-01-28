//public class multithread {
//    void fun1()
//    {
//        for(int i=1;i<=500;i++)
//            System.out.print(i+" ");
//    }
//    void fun2()
//    {
//        for(int i=501;i<=1000;i++)
//            System.out.print(i+" ");
//    }
//    public static void main(String[] args) {
//        multithread obj1 = new multithread();
//        multithread obj2 = new multithread();
//        obj1.fun2();
//        obj2.fun1();
//    }
//}

import java.util.*;
class CustomerThread extends Thread {
    private final BankAccount account;

    public CustomerThread(BankAccount account) {
        this.account = account;
    }

    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);
        // Simulate a scenario where the customer deposits and withdraws money
        for (int i = 0; i < 5; i++) {
//            int amountToDeposit = (int) (Math.random() * 1000);
//            account.deposit(amountToDeposit);
//
//            int amountToWithdraw = (int) (Math.random() * 1000);
//            account.withdraw(amountToWithdraw);
            System.out.println("Enter 1 to deposit, 0 to withdraw");
            int ch = sc.nextInt();
            if(ch == 1) {
                System.out.println("Enter amount to deposit");
                int amountToDeposit = sc.nextInt();
                account.deposit(amountToDeposit);
            }
            else {
                System.out.println("Enter amount to withdraw");
                int amountToWithdraw = sc.nextInt();
                account.withdraw(amountToWithdraw);
            }
        }
    }
}

class BankAccount {
    private int balance = 0;

    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
        System.out.println("Current balance: " + balance);
    }

    public synchronized void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("Current balance: " + balance);
        } else {
            System.out.println("Insufficient balance for withdrawal: " + amount);
        }
    }
}

public class multithread {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        // Create two customer threads
        CustomerThread customer1 = new CustomerThread(account);
        CustomerThread customer2 = new CustomerThread(account);

        // Start the customer threads
        customer1.start();
        customer2.start();
    }
}
