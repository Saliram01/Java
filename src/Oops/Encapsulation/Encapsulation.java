package Oops.Encapsulation;

class BankAccount {
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountHolderName,double initialBalance){
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName){
        this.accountHolderName = accountHolderName;
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public void deposit(double amount){
        if(amount > 0) {
            balance += amount;
            System.out.println("Deposited : " + amount);
        }
        else {
            System.out.println("Deposit amount must be greater than zero.");
        }
    }

    public void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("Withdraw : " + amount);
        }
        else {
            System.out.println("Invalid withdraw amount.");
        }
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount("SaliRam Chaudhuri",1000);

        ba.deposit(500);
        System.out.println(ba.getBalance());
        ba.withdraw(1000);

        System.out.println(ba.getBalance());
        System.out.println(ba.getAccountHolderName());
    }
}
