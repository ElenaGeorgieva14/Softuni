package BankAccount;

public class BankAccount {
    private  static int nextId=1;
    private  int id;
    private double balance;
    private static double rate =0.02;


    public BankAccount(){
        this.id=nextId;
        nextId++;

    }

    public static void setInterestRate(double interest){
        rate=interest;
    }

    public double getInterest(int years){
        return rate*years*this.balance;
    }

    public void deposit(double amount){
        this.balance+=amount;
    }

    public  int getId(){
        return id;
    }
}
