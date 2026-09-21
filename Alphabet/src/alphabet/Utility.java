package alphabet;

//Dung split "" cach doan van ban thanh cac tu, tu do goi ham cfication de cac chu o nhom nao,
//Tao 3 bien dem de cong don;
import java.util.Scanner;

public class Utility {

    public String classification(String input) {
        char first = input.toLowerCase().charAt(0);
        switch (first) {
            case 'a', 'e', 'u', 'i', 'o':
                return "Nguyên âm";
            case '0', '1', '2', '3', '4', '5', '6', '7', '8', '9':
                return "Chữ số";
            default:
                return "Ký tự khác";
        }
    }

    public void caculate() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(input);
        int countNA = 0, countCS = 0, countKTK = 0;
        String[] parts = input.split(" ");
        for (String part : parts) {
            String count = classification(part);//Truyền dữ liệu từ part vào hàm classfication,
            if (count.equals("Nguyên âm")) {
                countNA++;
            } else if (count.equals("Chữ số")) {
                countCS++;
            } else {
                countKTK++;
            }
        }
        System.out.println("Nguyên âm: " + countNA);
        System.out.println("Chữ số: " + countCS);
        System.out.println("Ký tự khác: " + countKTK);
    }

}
//String subjects = "Toán,Vật Lý,Hóa Học,Sinh Học,Ngữ Văn";
//Môn: Toán - Độ dài: 4
//Môn: Vật Lý - Độ dài: 6

//đầu tiên cách bằng dấu phẩy, sau lấy từng phần tử để mình đếm, mình nhận dữ liệu từ bàn phím
//data chính là dữ liệu của phần tử mà mình đưa vào