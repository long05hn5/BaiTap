package oop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Utility {

    public ArrayList<Manager> list;

    public Utility() {
        list = new ArrayList<>();

    }

    public boolean validDay(int day) {
        if (day >= 0) {
            return true;
        }
        return false;
    }

    public void insertManagerToList(Manager mag) {
        int id = list.size() + 1;
        mag.setId(id);
        list.add(mag);
    }

    public void printListManager() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
        }
    }

    public Employee inputEmployee() {
        Scanner sc = new Scanner(System.in);
        Employee emp = new Employee();
        String name;

        do {
            System.out.println("Nhập tên của nhân viên: ");
            name = sc.nextLine();
            emp.setName(name);
        } while (!emp.validName());

        float salary;
        boolean valid;
        do {
            valid = true;
            try {
                System.out.println("Nhập lương của nhân viên: ");
                salary = Float.parseFloat(sc.nextLine());
                emp.setSalary(salary);
                System.out.println(salary);
            } catch (NumberFormatException e) {
                System.out.println("Nhap sai du lieu");
                valid = false;
            }

        } while (valid == false || !emp.validSalary());

        int day = 0;

        do {
            valid = true;
            try {
                System.out.println("Nhập số ngày làm: ");
                day = Integer.parseInt(sc.nextLine());
                emp.calculateSalary(day);
            } catch (Exception e) {
                System.out.println("Nhập sai dữ liệu");
                valid = false;
            }
        } while (!validDay(day) || !valid);
        return emp;
    }

    public Manager inputManager() {
        Scanner sc = new Scanner(System.in);
        String department;
        Employee emp = inputEmployee();
        Manager mag = new Manager(emp.getName(), emp.getSalary());
        do {
            System.out.println("Nhập phòng ban: ");
            department = sc.nextLine();
            mag.setDepartment(department);
        } while (!mag.validDeP());
        return mag;
    }

    public void printMenu() {
        System.out.println("Chọn 1 để nhập dữ liệu");
        System.out.println("Chọn 2 để in ra");
        System.out.println("Chọn 3 để search");
        System.out.println("Chọn 4 để update");
        System.out.println("Chọn 5 để xóa nhân viên");
        System.out.print("Chọn: ");
    }

    public ArrayList<Manager> searchList(String key) {
        ArrayList<Manager> listSearch = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().toLowerCase().contains(key.toLowerCase())) {
                listSearch.add(list.get(i));
            }
        }
        return listSearch;
    }



    public Manager getManager(int id) {
        for (int i = 0; i < list.size(); i++) {
            if (id == list.get(i).getId()) {
                return list.get(i);
            }
        }
        return null;
    }

    public void setManger(int id) {
        Scanner sc = new Scanner(System.in);
//        id = sc.nextInt();
        Manager mage = getManager(id);
        Manager mag = inputManager();
        mage.setName(mag.getName());
        mage.setSalary(mag.getSalary());
        mage.setDepartment(mag.getDepartment());
    }

    public void deleteById(int id) {
        for (int i = 0; i < list.size(); i++) {
            if (id == list.get(i).getId()) {
                list.remove(list.get(i));
            }
        }
    }

    public int inputID() {
        Scanner sc = new Scanner(System.in);
        int id;
        System.out.println("Nhập ID");
        id = sc.nextInt();
        return id;
    }
}
