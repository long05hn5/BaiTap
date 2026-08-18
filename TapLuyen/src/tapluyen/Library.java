package tapluyen;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {

    public List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public Book createBook() {
        Book book = new Book();
        Scanner sc = new Scanner(System.in);
        String title;
        String author;
        double price;
        int quantity;
        boolean valid;
        do {
            System.out.println("Nhập title: ");
            title = sc.nextLine();
            book.setTitle(title);
        } while (!book.validTitle());

        do {
            System.out.println("Nhập author: ");
            author = sc.nextLine();
            book.setAuthor(author);
        } while (!book.validAuthor());

        do {
            try {
                System.out.println("Nhập price: ");
                price = Double.parseDouble(sc.nextLine());
                book.setPrice(price);
                valid = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input");
                valid = false;
            }

        } while (!book.validPrice() || !valid);

        do {
            try {
                System.out.println("Nhập quantity: ");
                quantity = Integer.parseInt(sc.nextLine());
                book.setQuantity(quantity);
                valid = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input");
                valid = false;
            }

        } while (!book.validQuantity() || !valid);
        return book;
    }

    public ArrayList<Book> searchBookByTitle(String key) {
        ArrayList<Book> listSearch = new ArrayList<>();
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getTitle().toLowerCase().equalsIgnoreCase(key.toLowerCase())) {
                listSearch.add(books.get(i));

            }
        }
        return listSearch;
    }

    public void deleteBookById(int id) {
        for (int i = 0; i < books.size(); i++) {
            if (id == books.get(i).getId()) {
                books.remove(books.get(i));
            }
        }
    }

    public void insertBookToLibary(Book book) {
        int id = books.size() + 1;
        book.setId(id);
        books.add(book);
    }

    public void printListBook() {
        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i).toString());
        }
    }

    public void printMenu() {
        System.out.println("Nhập 1 để thêm book");
        System.out.println("Nhập 2 để xóa sách ");
        System.out.println("Nhập 3 để tìm sách theo ID");
        System.out.println("Nhập 4 để tìm sách theo title");
        System.out.println("Nhập 5 để hiển thị toàn bộ sách");
        System.out.println("Nhập 6 để cập nhật số lượng sách");
        System.out.println("Nhập 7 để tìm sách có giá cao nhất");
        System.out.println("Nhập 8 để tìm tổng giá trị kho sách");
        System.out.println("Nhập 9 để sắp xếp");
        System.out.println("Chọn");
    }

    public void searchBookById(int id) {
        for (int i = 0; i < books.size(); i++) {
            if (id == books.get(i).getId()) {
                System.out.println(books.get(i));
            }
        }
    }

    public int id() {
        Scanner sc = new Scanner(System.in);
        int id;
        System.out.println("Nhập ID");
        id = sc.nextInt();
        return id;
    }

    public Book getBook(int id) {
        for (int i = 0; i < books.size(); i++) {
            if (id == books.get(i).getId()) {
                return books.get(i);
            }
        }
        return null;
    }

    public Book updateQuantity() {
        Book book = new Book();
        Scanner sc = new Scanner(System.in);

        int quantity;
        boolean valid;

        do {
            try {
                System.out.println("Nhập quantity: ");
                quantity = Integer.parseInt(sc.nextLine());
                book.setQuantity(quantity);
                valid = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input");
                valid = false;
            }

        } while (!book.validQuantity() || !valid);
        return book;
    }

    public void setQuantityBook(int id) {
        Book book = getBook(id);
        Book bookk = updateQuantity();
        book.setQuantity(bookk.getQuantity());
    }

    public void arrangeListBook() {
        for (int i = 0; i < books.size(); i++) {
            for (int j = i + 1; j < books.size(); j++) {
                if (books.get(i).getPrice() < books.get(j).getPrice()) {
                    Book temp = books.get(i);
                    books.set(i, books.get(j));
                    books.set(j, temp);
                }
            }
        }
    }

    public void searchMaxPriceBook() {
        arrangeListBook();
        System.out.println(books.get(0));
    }

    public void caculate() {
        double total;
        for (int i = 0; i < books.size(); i++) {
            total = books.get(i).getPrice() * books.get(i).getQuantity();
            System.out.println(books.get(i) + " Tổng giá trị kho sách: " + total);
        }

    }

    public void arrangeListBookLow() {
        for (int i = 0; i < books.size(); i++) {
            for (int j = i + 1; j < books.size(); j++) {
                if (books.get(i).getPrice() > books.get(j).getPrice()) {
                    Book temp = books.get(i);
                    books.set(i, books.get(j));
                    books.set(j, temp);
                }
            }
        }
    }

    public void viewArrange() {
        System.out.println("Danh sách từ cao đến thấp:");
        arrangeListBook();
        printListBook();
        System.out.println("=======================");
        System.out.println("Danh sách từ thấp đến cao");
        arrangeListBookLow();
        printListBook();
    }

}
