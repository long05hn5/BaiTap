
package storemanager;

import java.util.Date;


public class Invoice {
    private String nameCustomer;
    private String idEmployee;
    private Date date;
    private double price;

    public Invoice() {
    }

    public Invoice(String nameCustomer, String idEmployee, Date date, double price) {
        this.nameCustomer = nameCustomer;
        this.idEmployee = idEmployee;
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
    
    
}
