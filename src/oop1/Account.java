package oop1;

public class Account {
    int balance;

    void deposit(int amount){
        balance += amount;
    }

    void withdraw(int amount){
        if (amount > balance){
            System.out.println("Not enough balance");
            return;
        }
        balance -= amount;
    }
}
