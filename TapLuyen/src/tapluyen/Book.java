package tapluyen;

public class Book {

    private int id;
    private String title;
    private String author;
    private double price;


    public Book() {
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

 

    @Override
    public String toString() {
        return "Book{" + "id=" + id + ", title=" + title + ", author=" + author + ", price=" + price +  '}';
    }

}
