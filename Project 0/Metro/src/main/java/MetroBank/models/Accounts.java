package MetroBank.models;

public class Accounts {

    private int id;
    private double balance;
    private String account_type;

    public Accounts() {

    }

    public Accounts(String account_type) {
        this.account_type = account_type;
    }

    public Accounts(int id, double balance, String account_type) {
        this.id = id;
        this.balance = balance;
        this.account_type = account_type;
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

    public String getAccount_type() {
        return account_type;
    }

    public void setAccount_type(String account_type) {
        this.account_type = account_type;
    }







    @Override
    public String toString() {

        return this.id + " " + this.balance + " " + this.account_type;
    }

}
