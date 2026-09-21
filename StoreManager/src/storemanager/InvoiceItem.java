package storemanager;


public class InvoiceItem {

    private String productId;
    private double price;
    private double total;
    private int quantity;

    public InvoiceItem() {
    }

    public InvoiceItem(String productId, double price, int quantity) {
        this.productId = productId;
        this.price = price;
        this.quantity = quantity;
        this.total = this.price *this.quantity;
        
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTotal() {
        return total;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    @Override
    public String toString() {
        return productId + ", " + price + ", " + total + ", " + quantity;
    }

}
