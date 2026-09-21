package tapluyen2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Utility {

    public List<Product> products;//Tao 1 list khai bao bien toan cuc

    public Utility() {
        products = new ArrayList<>();//Them san pham vao list
        loadProductFromFile();
    }
    public static final String DEFAUL_FILE = "product.txt";

    public void arrageProductsMaximumtoMinimum() {
        for (int i = 0; i < products.size(); i++) {
            for (int j = i + 1; j < products.size(); j++) {
                if (products.get(i).getId() < products.get(j).getId()) {
                    Product temp = products.get(i);
                    products.set(i, products.get(j));
                    products.set(j, temp);
                }
            }
        }
    }

    public int generateIdInList() {
        if (products.size() > 0) {
            return products.get(products.size() - 1).getId() + 1;
        } else {
            return 1;
        }
    }

    public void input(Scanner sc) {
        int choice;
        do {
            System.out.println("Nhập 1 để tạo Food");
            System.out.println("Nhập 2 để tạo Electronic");
            System.out.println("Nhập 3 để tạo Clothing");
            choice = sc.nextInt();
            sc.nextLine();
            Product product = null;
            switch (choice) {
                case 1:
                    product = new Food();
                    break;
                case 2:
                    product = new Electronic();
                    break;
                case 3:
                    product = new Clothing();
                    break;
            }
            if (product != null) {
                product.input(sc);
                product.setId(generateIdInList());
                products.add(product);
                break;
            }
        } while (choice != 0);
    }

    public void printListProduct() {
        for (int i = 0; i < products.size(); i++) {
            System.out.println(products.get(i).toString());
        }
    }

    public void printMenu() {
        System.out.println("Nhập 1 để tạo sản phẩm");
        System.out.println("Nhập 2 để xem sản phẩm");
        System.out.println("Nhập 3 để xóa sản phẩm");
        System.out.println("Nhập 4 để sửa sản phẩm");
        System.out.println("Nhập 5 để save file");
        System.out.print("Chọn:");
    }

    public Product getProductById(int id) {
        for (int i = 0; i < products.size(); i++) {
            if (id == products.get(i).getId()) {
                return products.get(i);
            }
        }
        return null;
    }

    public void deleteById(int id) {
        products.remove(getProductById(id));
    }

    public int inputId() {
        Scanner sc = new Scanner(System.in);
        int id;
        System.out.println("Nhập ID");
        id = sc.nextInt();
        return id;
    }

    public void updateById(int id) {
        Scanner sc = new Scanner(System.in);
        // for (Product p : products) {
        //     if (id == p.getId()) {
        //         p.input(sc);
        //         return;
        //     }
        // }

        getProductById(id).input(sc);
    }

    public boolean saveFile() {//luu file
        try (PrintWriter writer = new PrintWriter(new FileWriter(DEFAUL_FILE))) {//tao 1 object de sava file co ten la ....'
            for (Product p : products) {//duyet 1 list product
               writer.print(p.formatToSaveFile());//luu vao file cac tham so
            }
            return true;
        } catch (Exception ex) {
            System.out.println("Save file failed" + ex.getMessage());
            return false;
        }

    }

    public void loadProductFromFile() {//tu file nhap vao
        File file = new File(DEFAUL_FILE);
        if (file.exists() == false) {
            System.out.println("File khong ton tai");
            return;
        } else {
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    String[] parts = line.split(", ");      
                    if (parts[0].equals("f")) {
                        String id = parts[1];
                        String name = parts[2];
                        String price = parts[3];
                        String expiryDate = parts[4];
                        Product p = new Food(Integer.parseInt(id), name, Double.parseDouble(price), expiryDate);
                        products.add(p);
                    } else if (parts[0].equals("e")) {
                        String id = parts[1];
                        String name = parts[2];
                        String price = parts[3];
                        String warrantyMonths = parts[4];
                        Product p = new Electronic(Integer.parseInt(id), name, Double.parseDouble(price), Integer.parseInt(warrantyMonths));
                        products.add(p);
                    } else if (parts[0].equals("c")) {
                        String id = parts[1];
                        String name = parts[2];
                        String price = parts[3];
                        String size = parts[4];
                        String color = parts[5];
                        Product p = new Clothing(Integer.parseInt(id), name, Double.parseDouble(price), Integer.parseInt(size), color);
                        products.add(p);
                    }
                }

            } catch (Exception ex) {
                System.out.println("loadProductFromFile" + ex.getMessage());
            }
        }

    }

}
