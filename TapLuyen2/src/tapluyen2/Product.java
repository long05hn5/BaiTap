package tapluyen2;

import java.util.Scanner;

public class Product {

    private int id;
    private String name;
    private double price;

    public Product() {
    }

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean validName() {
        if (this.name != null && this.name != "") {
            return true;
        }
        return false;
    }

    public boolean validPrice() {
        try {
            if (this.price > 0) {
                return true;
            }
        } catch (NumberFormatException e) {
            System.out.println("Nhập sai dữ liệu");
        }
        return false;
    }

    public void input(Scanner sc) {
        boolean valid;
        do {
            System.out.println("Nhập tên sản phẩm");
            this.name = sc.nextLine();
        } while (!validName());
        do {
            try {
                System.out.println("Nhập giá sản phẩm");
                this.price = Double.parseDouble(sc.nextLine());
                valid = true;
            } catch (NumberFormatException e) {
                System.out.println("Nhập sai input");
                valid = false;
            }
        } while (!validPrice() || !valid);
    }

    @Override
    public String toString() {
        return "ID sản phẩm: " + id + " , " + "Tên sản phẩm: " + name + " , " + " Giá sản phẩm: " + price;
    }
    
    public String formatToSaveFile(){
        return id + ", " + name + ", " + price;
    }

}
