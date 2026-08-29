package tapluyen2;

import java.util.Scanner;

public class Clothing extends Product {

    private int size;
    private String color;

    public Clothing() {
    }

    public Clothing(int size, String color) {
        this.size = size;
        this.color = color;
    }

    public Clothing( int id, String name, double price, int size, String color) {
        super(id, name, price);
        this.size = size;
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean validSize() {
        try {
            if (this.size > 0) {
                return true;
            }

        } catch (NumberFormatException e) {
            System.out.println("Nhập sai dữ liệu");
        }
        return false;
    }
    
    public boolean validColor(){
        if(this.color != null && this.color != ""){
            return true;
        }
        return false;
    }

    @Override
    public void input(Scanner sc) {
        super.input(sc);
        boolean valid;
        do{
            System.out.println("Nhập màu sản phẩm");
            this.color = sc.nextLine();
        }while(!validColor());
        
        do{
            try{
                System.out.println("Nhập size sản phẩm");
                this.size = Integer.parseInt(sc.nextLine());
                valid = true;
            }catch(NumberFormatException e){
                System.out.println("Nhập sai dữ liệu");
                valid = false;
            }
        }while(!validSize() || !valid);
    }
    
    @Override
    public String toString() {
        return super.toString() + " , "  + " Size: " + size + " Màu: " + color;
    }

    @Override
    public String formatToSaveFile() {
        return "c" + "," +super.formatToSaveFile() + ", "+ size + ", " + color; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    
}
