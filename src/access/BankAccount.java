package access;

public class BankAccount {
    private int balance;


    public BankAccount() {
        balance = 0;
    }



    // public method: deposit
    public void deposit (int amount) {
        if (isAmountValid(amount)) {
            balance += amount;
        } else {
            System.out.println("Amount is not valid");
        }
    }

    // public method: withdraw
    public void withdraw (int amount) {
        if (isAmountValid(amount) && balance - amount >= 0) {
            balance -= amount;
        } else {
            System.out.println("Amount is not valid or Balance is not enough");
        }
    }

    public int getBalance() {
        return balance;
    }


    private boolean isAmountValid (int amount) {
        return amount > 0;
    }


    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(10000);
        account.withdraw(3000);
        System.out.println("balance = " + account.balance);
    }

}
