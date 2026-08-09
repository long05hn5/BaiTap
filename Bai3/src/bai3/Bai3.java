package bai3;

import java.util.Scanner;

public class Bai3 {
    
    public static void main(String[] args) {
//        BankAccount bank = new BankAccount(500000, "Do Long", 800);
//        bank.napTien(500);
//        bank.rutTien(1000);
//        System.out.println(bank.toString());
        Scanner sc = new Scanner(System.in);
        BankAccount bank = new BankAccount();
        
        int accountNumber;
        do {
            System.out.print("Nhap so tai khoan: ");
            accountNumber = sc.nextInt();
            bank.setAccountNumber(accountNumber);
        } while (!bank.validNum());
        
        String accountName;
        do {
            System.out.print("Nhap ten tai khoan: ");
            accountName = sc.nextLine();
            bank.setAccountName(accountName);
        } while (!bank.validAcc());
        
        int Balance;
        do {
            System.out.println("Nhap so du: ");
            Balance = sc.nextInt();
            bank.setBalance(Balance);
        } while (!bank.validBal());
        
        float napTien;
        do {
            System.out.println("Nhap so tien muon them: ");
            napTien = sc.nextFloat();
            bank.napTien(napTien);
        } while (!bank.validAdd(napTien));
        
        float rutTien;
        do {
            System.out.println("Nhap so tien muon rut: ");
            rutTien = sc.nextFloat();
            bank.rutTien(rutTien);
        } while (!bank.validWith(rutTien));
        
        System.out.println(bank.toString());
    }
    
}
