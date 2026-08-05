
package bai3;

public class Bai3 {

  
    public static void main(String[] args) {
        BankAccount bank = new BankAccount(500000, "Do Long", 800);
        bank.napTien(500);
        bank.rutTien(1000);
        System.out.println(bank.toString());

    }

}
