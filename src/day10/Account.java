package day10;

public class Account {
    private int id;
    private double balance;
    private double annurate;

    public Account() {
    }

    public Account(int id, double balance, double annurate) {
        this.id = id;
        this.balance = balance;
        this.annurate = annurate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnurate() {
        return annurate;
    }

    public void setAnnurate(double annurate) {
        this.annurate = annurate;
    }

    public void withdraw(double amount){//取钱
        if(this.balance<amount) {
            System.out.println("余额不足");
            return;
        }
        this.balance-=amount;
    }

    public void deposti(double amount){
        if(amount>0){
            this.balance+=amount;
            System.out.println("存入"+amount+"钱");
        }
    }
}
