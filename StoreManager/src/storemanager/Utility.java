package storemanager;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Utility {

    public List<Employee> employees;
    public List<Customer> customers;
    public List<Invoice> invoices;
    public List<Product> products;

    public Utility() {
        employees = new ArrayList<>();
        customers = new ArrayList<>();
        invoices = new ArrayList<>();
        products = new ArrayList<>();
    }

    public static final String LOGIN_FILE = "login.txt";
    public static final String INVOICE_FILE = "invoice.txt";
    public static final String PRODUCT_FILE = "product.txt";
    public static final String CUSTOMER_FILE = "customer.txt";

    public List readEmployeeFromFile() {
        File file = new File(LOGIN_FILE);
        if (file.exists() == false) {
            System.out.println("Không có file");
        } else {
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    String[] parts = line.split(", ");
                    String id = parts[0];
                    String username = parts[1];
                    String password = parts[2];
                    String name = parts[3];
                    String phoneNumber = parts[4];
                    Employee emp = new Employee(id, username, password, name, phoneNumber, name);
                    employees.add(emp);
                    System.out.println(emp);

                }
            } catch (Exception e) {
                System.out.println("loginEmployee" + e.getMessage());
            }
        }
        return employees;
    }

    public List readCustomersFromFile() {
        File file = new File(CUSTOMER_FILE);
        if (file.exists() == false) {
            System.out.println("Không có file");
        } else {
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    String[] parts = line.split(", ");
                    String nameCustomer = parts[0];
                    String phoneNumber = parts[1];
                    Customer cus = new Customer(nameCustomer, phoneNumber);
                    customers.add(cus);
                }
            } catch (Exception e) {
                System.out.println("readCustomersFromFile" + e.getMessage());
            }
        }
        return customers;
    }

    public void readProductFromToFile() {
        File file = new File(PRODUCT_FILE);
        if (file.exists() == false) {
            System.out.println("File không tồn tại ");
        } else {
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    String[] parts = line.split(", ");
                    String productId = parts[0];
                    String nameProduct = parts[1];
                    String price = parts[2];
                    Product p = new Product(productId, nameProduct, Double.parseDouble(price));
                    products.add(p);
                }
            } catch (Exception e) {
                System.out.println("readProductFromToFile" + e.getMessage());
            }
        }

    }

    public void writeProducttoFile() {
        try (PrintWriter writer = new PrintWriter(new FileWriter(CUSTOMER_FILE))) {
            for (Customer cus : customers) {
                writer.println(cus.formatToSaveFile());

            }

        } catch (Exception e) {
            System.out.println("readProductFromToFile" + e.getMessage());

        }

    }

    public boolean loginEmployee() {
        File file = new File(LOGIN_FILE);
        if (file.exists() == false) {
            System.out.println("Không có file");
            return false;
        } else {
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String line;
                String username;
                String password;
                String usernameEmp;
                String passwordEmp;
                Scanner sc = new Scanner(System.in);
                username = sc.nextLine();
                password = sc.nextLine();
                while ((line = reader.readLine()) != null) {
                    do {
                        String[] parts = line.split(", ");
                        usernameEmp = parts[2];
                        passwordEmp = parts[3];
                        if (username.equals(usernameEmp) && password.equals(passwordEmp)) {
                            System.out.println("Xác thực thành công");
                        } else {
                            System.out.println("Tài khoản hoặc mật khẩu sai");
                        }
                    } while (!username.equals(usernameEmp) || !password.equals(passwordEmp));
                    return true;
                }
            } catch (Exception e) {
                System.out.println("loginEsmployee" + e.getMessage());
                return false;
            }
        }
        return false;
    }

    public Customer checkCustomer(String phoneNumber) {
        for (Customer cus : customers) {
            if (phoneNumber.equals(cus.getPhoneNumber())) {
                return cus;
            }
        }
        return null;
    }

    public Product checkProductByName(String productName) {
        for (Product p : products) {
            if (productName.equalsIgnoreCase(p.getNameProduct())) {
                return p;
            }
        }
        return null;
    }

    public String createInvoice() {
        Scanner sc = new Scanner(System.in);
        Product p;
        Customer cus;
        int quantity;
        String productName;
        String phoneNumber;
        String nameCustomer;
        do {
            System.out.println("Nhập số điện thoại khách hàng");
            phoneNumber = sc.nextLine();
            cus = checkCustomer(phoneNumber);
            if (cus == null) {
                System.out.println("Nhập tên của khách hàng");
                nameCustomer = sc.nextLine();
                System.out.println("Nhập số điện thoại mới của khách hàng");
                phoneNumber = sc.nextLine();
                cus = new Customer(nameCustomer, phoneNumber);
                customers.add(cus);
                writeProducttoFile();
            }
        } while (cus == null);

        System.out.println("Nhập sản phẩm khách chọn");
        productName = sc.nextLine();
        p = checkProductByName(productName);

        System.out.println("Số lượng sản phẩm mà khách chọn");
        quantity = sc.nextInt();
        double total = totalInvoice(quantity, productName);
        System.out.println(total);

        String all = "Tên khách hàng: " + cus.getNameCustomer() + " Số điện thoại: " + cus.getPhoneNumber() + " Tổng số tiền: "+total;
        return all;
    }

    public double totalInvoice(int quantity, String productName) {
        for (Product p : products) {
            if (p.getNameProduct().equalsIgnoreCase(productName)) {
                double total = quantity * p.getPrice();
                return total;
            }
        }
        return 0;
    }

    //Kiem tra customer co hay chua, neu co goi ham lay du lieu cua customer insert vao invoice
    //Lay du lieu product update vao invoice tren.
    //Viet ham tinh tong total dua vao list invoice bang cach duyet vong for va tinh tong.
    public boolean invoiceFile() {
        try (PrintWriter writer = new PrintWriter(new FileWriter(INVOICE_FILE))) {
            writer.println(createInvoice());
            return true;
        } catch (Exception e) {
            System.out.println("invoiceFile" + e.getMessage());
            return false;
        }

    }

}
