package tapluyen;

public class Book {

    private int id;
    private String title;
    private String author;
    private double price;
    private int quantity;

    public Book() {
    }

    public Book(int id, String title, String author, double price, int quantity) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean validTitle() {
        if (this.title != null && this.title != "") {
            return true;
        }
        return false;
    }

    public boolean validAuthor() {
        if (this.author != null && this.author != "") {
            return true;
        }
        return false;
    }

    public boolean validPrice() {
        try {
            if (this.price >= 0) {
                return true;
            }
        } catch (NumberFormatException e) {
            System.out.println("Nhập sai dữ liệu");
        }
        return false;
    }

    public boolean validQuantity() {
        try {
            if (this.quantity >= 0) {
                return true;
            }
        } catch (NumberFormatException e) {
            System.out.println("Nhập sai dữ liệu");
        }
        return false;
    }

    @Override
    public String toString() {
        return "Book{" + "id=" + id + ", title=" + title + ", author=" + author + ", price=" + price + ", quantity=" + quantity + '}';
    }

}
