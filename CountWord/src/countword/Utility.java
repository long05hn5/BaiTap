package countword;

//String subjects = "Toán,Vật Lý,Hóa Học,Sinh Học,Ngữ Văn";
import java.util.Scanner;

//Môn: Toán - Độ dài: 4
//Môn: Vật Lý - Độ dài: 6
//đầu tiên cách bằng dấu phẩy, sau lấy từng phần tử để mình đếm, mình nhận dữ liệu từ bàn phím
//data chính là dữ liệu của phần tử mà mình đưa vào
//Dung ham gi de bo dau cach di
public class Utility {

    public void count() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] parts = input.split(",");
        for (String part : parts) {//Cái này dùng để duyệt từng phần tử sau dấu","
            String[] subPart = part.split(" ");
            int total = 0;
            for (String sub : subPart) {//Cái này dùng để đếm từng phần tử
                int count = sub.length();//Leng lấy độ dài của phần tử
                total = total + count;
            }
            System.out.println(part + " - " + total);
        }
    }
}
