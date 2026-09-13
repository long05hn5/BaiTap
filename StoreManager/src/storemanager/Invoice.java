package storemanager;

import java.util.Date;

public class Invoice {

    private String nameCustomer;
    private String idEmployee;
    private String productName;
    private Date date;
    private double price;

    public Invoice() {
    }

    public Invoice(String nameCustomer, String idEmployee, String productName, Date date, double price) {
        this.nameCustomer = nameCustomer;
        this.idEmployee = idEmployee;
        this.productName = productName;
        this.date = date;
        this.price = price;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public String getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(String idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

   

    @Override
    public String toString() {
        return nameCustomer + productName ;
    }

}
