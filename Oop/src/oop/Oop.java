package oop;

public class Oop {

    public static void main(String[] args) {
        Employee emp = new Employee("Long", 100);
        Manager mag = new Manager("Phòng ban IT", "Điệp", 1000);
        Developer dev = new Developer("Java", "Long", 10000);

        emp.work();
        mag.work();
        dev.work();
        
        System.out.println(emp.calculateSalary(5));
        
        System.out.println(mag.calculateSalary(20));
        
        System.out.println(dev.calculateSalary(10));
        
        System.out.println(Employee.companyInfo());
    }

}
