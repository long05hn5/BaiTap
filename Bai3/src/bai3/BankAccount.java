package bai3;

public class BankAccount {

    private int accountNumber;
    private String accountName;
    private float balance;

    public BankAccount() {
    }

    public BankAccount(int accountNumber, String accountName, float balance) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public float napTien(float napTien) {
        this.balance = napTien + this.balance;
        return this.balance;
    }

    public float rutTien(float rutTien) {
        if (this.balance >= rutTien) {
            this.balance = this.balance - rutTien;
        }
        return this.balance;
    }

    public Boolean validNum() {
        if (this.accountNumber > 0) {
            return true;
        }
        return false;
    }

    public Boolean validBal() {
        if (this.balance >= 0) {
            return true;
        }
        return false;
    }

    public Boolean validAcc() {
        if (this.accountName != null && this.accountName != "") {
            return true;
        }
        return false;
    }

    public Boolean validAdd(float napTien) {
        if (napTien >= 0) {
            return true;
        }
        return false;
    }

    public Boolean validWith(float rutTien) {
        if (rutTien > 0 && rutTien <= this.balance) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return accountNumber + ", " + accountName + ", " + balance;
    }

}
