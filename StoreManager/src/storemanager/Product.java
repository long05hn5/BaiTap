package storemanager;

public class Product {

    private String productId;
    private String nameProduct;
    private double price;
   
    public Product() {
    }

    public Product(String productId, String nameProduct, double price) {
        this.productId = productId;
        this.nameProduct = nameProduct;
        this.price = price;
    }
    
    
    public Product(String productId, String nameProduct, double price, int quantity) {
        this.productId = productId;
        this.nameProduct = nameProduct;
        this.price = price;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return  "Tên sản phẩm: "+nameProduct + ", " + price;
    }

}
