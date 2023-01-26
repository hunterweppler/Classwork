public class BankAccount {
    private String owner;
    private int accountNum;
    private double balance;

    public BankAccount(String name, int accountNum){
        owner = name;
        this.accountNum = accountNum;
        balance = 0;
    }
    public void deposit(double amount){
        balance += amount;
    }
    public String toString() {
        return owner + " has Account " + accountNum + " With a Balance of $" + balance;
    }
}
