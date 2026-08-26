package tapluyen2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Utility {

    public List<Product> products;

    public Utility() {
        products = new ArrayList<>();
    }

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
        System.out.print("Chọn:");
    }

    public void deleteById(int id) {
        for (int i = 0; i < products.size(); i++) {
            if (id == products.get(i).getId()) {
                products.remove(i);
            }
        }
    }

    public int inputId() {
        Scanner sc = new Scanner(System.in);
        int id;
        System.out.println("Nhập ID");
        id = sc.nextInt();
        return id;
    }

    public void updateById(int id ) {
        Scanner sc = new Scanner(System.in);
        for (Product p : products) {
            if (id == p.getId()) {
                p.input(sc);
                return;
            }
        }

    }
}
