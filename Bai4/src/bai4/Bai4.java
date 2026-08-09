/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai4;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Employee emp = new Employee(101,"Do Long", 25000,25);
//        System.out.println(emp.toString());

        Scanner sc = new Scanner(System.in);
        Employee emp = new Employee();
        int employeeId;
        do {
            System.out.println("Nhap ID cua nhan vien: ");
            employeeId = sc.nextInt();
            emp.setEmployeeId(employeeId);
        } while (!emp.validId());

        String fullName;
        do {
            System.out.println("Nhap ho va ten cua nhan vien : ");
            fullName = sc.nextLine();
            emp.setFullName(fullName);
        } while (!emp.validName());

        float basicSalary;
        do {
            System.out.println("Nhap luong co ban cua nhan vien");
            basicSalary = sc.nextFloat();
            emp.setBasicSalary(basicSalary);
        } while (!emp.validBas());

        int workDays;
        do {
            System.out.println("Nhap so ngay lam");
            workDays = sc.nextInt();
            emp.setWorkDays(workDays);
        } while (!emp.validWor());

        System.out.println(emp.toString());

    }

}
