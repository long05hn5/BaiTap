package tinhtoan;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Utility {

    public void caculate() {
        Scanner sc = new Scanner(System.in);
        String input;

        String result = "";
        do {
            System.out.print("Input: ");
            input = sc.nextLine();
            if(input.equals("exit")){
                break;
            }
         
            String[] parts = input.split(" ");
            String operation = parts[0];
            double a = Double.parseDouble(parts[1]);
            double b = Double.parseDouble(parts[2]);
            DecimalFormat df = new DecimalFormat("#.###");
            switch (operation) {
                case "add":
                    result = String.valueOf(a + b);
                    break;
                case "sub":
                    result = String.valueOf(a - b);
                    break;
                case "mul":
                    result = String.valueOf(a * b);
                    break;
                case "div":                    
                    result = String.valueOf(df.format(a / b));
                    break;
            }
            System.out.println("Output " + result);
        } while (!input.equalsIgnoreCase("exit"));

        
    }

}
