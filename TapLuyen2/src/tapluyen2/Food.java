package tapluyen2;

import java.util.Scanner;

public class Food extends Product {
     private String expiryDate;

    public Food() {
    }

    public Food(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public Food(int id, String name, double price,String expiryDate) {
        super(id, name, price);
        this.expiryDate = expiryDate;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

   public boolean validExpiryDate(){
       if(this.expiryDate != null && this.expiryDate != ""){
           return true;
       }
       return false;
   }

    @Override
    public void input(Scanner sc) {
        super.input(sc); 
        do{
            System.out.println("Nhập ngày hết hạn: ");
            this.expiryDate = sc.nextLine();
        }while(!validExpiryDate());
    }

 
    @Override
    public String toString() {
        return  super.toString() + " , "  + "Ngày hết hạn: " + expiryDate ;
    }

    @Override
    public String formatToSaveFile() {
        return "f" + "," +super.formatToSaveFile() + ", " + expiryDate;
    }
     
    
}
