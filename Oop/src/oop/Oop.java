package oop;

import java.util.Scanner;

public class Oop {

    public static void main(String[] args) {
//        Employee emp = new Employee("Long", 100);
//        Manager mag = new Manager("Phòng ban IT", "Điệp", 1000);
//        Developer dev = new Developer("Java", "Long", 10000);
//
//        emp.work();
//        mag.work();
//        dev.work();

//        System.out.println(emp.calculateSalary(5));
//        
//        System.out.println(mag.calculateSalary(20));
//        
//        System.out.println(dev.calculateSalary(10));
//        
//        System.out.println(Employee.companyInfo());
        Scanner sc = new Scanner(System.in);
        Employee emp = new Employee();
        String name;
        do {
            System.out.println("Nhập tên của nhân viên: ");
            name = sc.nextLine();
            emp.setName(name);
        } while (!emp.validName());

        float salary;
        do {
            System.out.println("Nhập lương của nhân viên: ");
            salary = sc.nextFloat();
            emp.setSalary(salary);
        } while (!emp.validSalary());

        int day;
        do {
            System.out.println("Nhập số ngày làm: ");
            day = sc.nextInt();
            emp.calculateSalary(day);
        } while (!emp.validDay(day));
        System.out.println("=====================================");
        sc.nextLine();

        Manager mag = new Manager();
        do {
            System.out.println("Nhập tên của quản lý: ");
            name = sc.nextLine();
            mag.setName(name);
        } while (!mag.validName());
        String department;
        do {
            System.out.println("Nhập phòng ban: ");
            department = sc.nextLine();
            mag.setDepartment(department);
        } while (!mag.validDeP());

        do {
            System.out.println("Nhập lương của quản lý: ");
            salary = sc.nextFloat();
            mag.setSalary(salary);
        } while (!mag.validSalary());
        do {
            System.out.println("Nhập số ngày làm: ");
            day = sc.nextInt();
            mag.calculateSalary(day);
        } while (!emp.validDay(day));
        sc.nextLine();
        System.out.println("=====================================");
        Developer dev = new Developer();
        do {
            System.out.println("Nhập tên của Dev: ");
            name = sc.nextLine();
            dev.setName(name);
        } while (!dev.validName());

        String programmingLanguage;
        do {
            System.out.println("Nhập ngôn ngữ lập trình: ");
            programmingLanguage = sc.nextLine();
            dev.setProgrammingLanguage(programmingLanguage);
        } while (!dev.validPL());

        do {
            System.out.println("Nhập lương của Dev: ");
            salary = sc.nextFloat();
            dev.setSalary(salary);
        } while (!dev.validSalary());
        do {
            System.out.println("Nhập số ngày làm: ");
            day = sc.nextInt();
            dev.calculateSalary(day);
        } while (!dev.validDay(day));

        System.out.println(emp.toString());
        emp.work();
        
        System.out.println(mag.toString());
        mag.work();

        System.out.println(dev.toString());
        dev.work();

        System.out.println("Thông báo chung cả công ty " + Employee.companyInfo());

    }

}
