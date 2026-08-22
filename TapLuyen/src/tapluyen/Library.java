package tapluyen;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

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
        System.out.println("Nhập 10 để sắp xếp theo alaphabet");
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

    public void countListBookByTitle() {
        Map<String, Long> totalCountByTitle = books.stream()
                .collect(Collectors.groupingBy(
                        Book::getTitle,
                        Collectors.counting()
                ));
        totalCountByTitle.forEach((title, count) -> {
        System.out.println("Tên sách " + title + "| Số Lượng: " + count);
    });
    }
    
    public void caculateTotal(){
        double total = books.stream()
                .mapToDouble(Book::getPrice)
                .sum();
        System.out.println("Tổng giá của libary: " + total);
    }
    
    public void arrangeListBookByTitle(){
        books.sort((book1,book2) -> book1.getTitle().compareToIgnoreCase(book2.getTitle()));
        printListBook();
    }
}
