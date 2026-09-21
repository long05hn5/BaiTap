package storemanager;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Utility {

    public List<Employee> employees;
    public List<Customer> customers;
    public List<InvoiceItem> invoices;
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
                    String address = parts[5];
                    Employee emp = new Employee(id, username, password, name, phoneNumber, address);
                    employees.add(emp);

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
                    String customerId = parts[0];
                    String nameCustomer = parts[1];
                    String phoneNumber = parts[2];
                    Customer cus = new Customer(customerId, nameCustomer, phoneNumber);
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
            System.out.println("writeProducttoFile()" + e.getMessage());

        }

    }

    public Employee loginEmployee() {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("Nhập tài khoản:");
            String username = sc.nextLine();
            System.out.print("Nhập mật khẩu:");
            String password = sc.nextLine();
            for(Employee emp : employees){
                if(emp.getUsername().equals(username) && emp.getPassword().equals(password)){
                    return emp;
                }
            }
            System.out.println("Tài khoản hoặc mật khẩu sai");
        }
    }

    public Customer checkCustomer(String phoneNumber) {
        for (Customer cus : customers) {
            if (phoneNumber.equals(cus.getPhoneNumber())) {
                return cus;
            }
        }
        return null;
    }

    public Product checkProductByName(String productName) {//Hàm check xem có sản phẩm 
        for (Product p : products) {
            if (productName.equalsIgnoreCase(p.getNameProduct())) {
                return p;
            }
        }
        return null;
    }


    public void Order() {
        Employee emp = loginEmployee();
        Scanner sc = new Scanner(System.in);
        System.out.println("Vui lòng nhập số điện thoại: ");
        String phoneNumber = sc.nextLine();
        Customer cus = checkCustomer(phoneNumber);
        Invoice invoice;
        if (cus != null) {
            printMenu();
            List<InputFromCustomer> inputs = inputFC(sc);
            invoice = createInvoice(cus, inputs, emp);
            printInvoice(invoice);
         
        } else {
            createNewCustomer(sc);
            printMenu();
            List<InputFromCustomer> inputs = inputFC(sc);
            invoice = createInvoice(cus, inputs, emp);
            printInvoice(invoice);
        }
    }

    public void createNewCustomer(Scanner sc) {
        int id = customers.size() + 1;
        String customerId = "C" + id;
        System.out.println("Nhập tên khách hàng mới: ");
        String nameCustomer = sc.nextLine();
        System.out.println("Nhập số điện thoại mới của khách hàng: ");
        String phoneNumber = sc.nextLine();
        Customer cus = new Customer(customerId, nameCustomer, phoneNumber);
        customers.add(cus);
    }

    public void printInvoice(Invoice invoice) {
        //Ham nay de in ra toan bo hoa don + khach hang + chi tiet hoa don
        for (InvoiceItem in : invoice.getItems()) {
            System.out.println(in.toString());
        }
        System.out.println(invoice.toString());
        System.out.println("Tổng số tiền là");
        System.out.println(invoice.getTotal());
    }

    public List<InputFromCustomer> inputFC(Scanner sc) {
        List<InputFromCustomer> currentList = new ArrayList<>();

        System.out.println("Nhập lựa chọn (1: Thêm sản phẩm, 0: Thoát):");
        int choice = sc.nextInt();

        // Điều kiện dừng đệ quy
        if (choice == 0) {
            return currentList;
        }

        if (choice == 1) {
            // Cần xử lý trôi lệnh (clear buffer) trước khi nhập chuỗi
            sc.nextLine();

            System.out.println("Nhập tên sản phẩm:");
            String productName = sc.nextLine();

            System.out.println("Số lượng muốn:");
            int quantity = sc.nextInt();

            // Khởi tạo đối tượng
            InputFromCustomer iFC = new InputFromCustomer(productName, quantity);
            currentList.add(iFC);

            // Gọi đệ quy để tiếp tục quá trình nhập
            List<InputFromCustomer> nextItems = inputFC(sc);

            // Gộp kết quả đệ quy vào danh sách hiện tại
            currentList.addAll(nextItems);
        } else {
            System.out.println("Lựa chọn không hợp lệ, vui lòng thử lại.");
            return inputFC(sc); // Gọi lại nếu nhập sai
        }

        return currentList;
    }

    public Invoice createInvoice(Customer cus, List<InputFromCustomer> inputs, Employee emp) {
        ArrayList<InvoiceItem> items = new ArrayList<>();
        Date date = new Date();
        for (InputFromCustomer input : inputs) {
            Product p = checkProductByName(input.getProductName());
            InvoiceItem item = new InvoiceItem(p.getProductId(), p.getPrice(), input.getQuantity());
            items.add(item);
        }
        Invoice invoice = new Invoice(items, cus.getCustomerId(),
                emp.getId(), date.toString());

        return invoice;
    }

    //Kiem tra customer co hay chua, neu co goi ham lay du lieu cua customer insert vao invoice
    //Lay du lieu product update vao invoice tren.
    //Viet ham tinh tong total dua vao list invoice bang cach duyet vong for va tinh tong.
    public void printMenu() {
        System.out.println("Vui lòng chọn sản phẩm: ");
        for (Product p : products) {
            System.out.println(p.getNameProduct());
            System.out.println("========");
        }
    }//

}
