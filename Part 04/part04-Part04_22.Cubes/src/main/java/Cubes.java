
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {            
            String strInt = scanner.nextLine();
            
            if (strInt.equals("end"))
                break;
            
            int num = Integer.valueOf(strInt), temp = num;
            
            for (int i = 1; i <= 2; i++) {
                num *= temp;
            }
            
            System.out.println(num);
        }
    }
}
