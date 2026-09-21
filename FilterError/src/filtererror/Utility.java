package filtererror;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class Utility {

    public List<String> content;

    public Utility() {
        content = new ArrayList<>();

    }

    public static final String DEFAULT_FILE = "system.log";
    public static final String ERROR_FILE = "new.log";

    public void loadLogFromFile() {
        File file = new File(DEFAULT_FILE);
        if (file.exists() == false) {
            System.out.println("File khong ton tai");
            return;
        } else {
            try (BufferedReader reader = new BufferedReader(new FileReader(DEFAULT_FILE));
             BufferedWriter writer = new BufferedWriter(new FileWriter(ERROR_FILE))) {                 
                String line;
                while ((line = reader.readLine()) != null) {
                    if (line.contains("ERROR")) {
                        String text = line;
                        content.add(text);
                        writer.write(text+"\n");
                        System.out.println(text);                       
                    }

                }

            } catch (Exception ex) {
                System.out.println("loadLogFromFile" + ex.getMessage());
            }
        }
        
    }

}
//dau tien tao 2 file, 1 file de luu lai cac log, 1 file dung de luu cac log loi tu file so 1
//doc file so 1, roi kiem tra xem file so 1 do co chuoi la error khong
//neu co, se luu cai mang do vao file so 2
