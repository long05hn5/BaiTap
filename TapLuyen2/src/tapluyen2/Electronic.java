package tapluyen2;

import java.util.Scanner;

public class Electronic extends Product {

    private int warrantyMonths;

    public Electronic() {
    }

    public Electronic(int warrantyMonths) {
        this.warrantyMonths = warrantyMonths;
    }

    public Electronic(int id, String name, double price, int warrantyMonths) {
        super(id, name, price);
        this.warrantyMonths = warrantyMonths;
    }

    public int getWarrantyMonths() {
        return warrantyMonths;
    }

    public void setWarrantyMonths(int warrantyMonths) {
        this.warrantyMonths = warrantyMonths;
    }

    @Override
    public void input(Scanner sc) {
        super.input(sc);
        boolean valid;
        do {
            try {
                System.out.println("Nhập số tháng bảo hành");
                this.warrantyMonths = Integer.parseInt(sc.nextLine());
                valid = true;
            } catch (NumberFormatException e) {
                System.out.println("Nhập sai input");
                valid = false;
            }
        } while (!validWarrantyMonths() || !valid);

    }

    public boolean validWarrantyMonths() {
        try {
            if (this.warrantyMonths > 0) {
                return true;
            }
        } catch (NumberFormatException e) {
            System.out.println("Nhập sai dữ liệu");
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString() + " , " + " Tháng bảo hành:" + warrantyMonths;
    }

    @Override
    public String formatToSaveFile() {
        return  "e" + "," + super.formatToSaveFile() + ", " + warrantyMonths;
    }

}
