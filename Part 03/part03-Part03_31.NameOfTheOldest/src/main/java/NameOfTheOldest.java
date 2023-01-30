
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";
        int age = 0;
        
        while (true) {            
            String info = scanner.nextLine();
            
            if(!info.isEmpty()) {
                String[] singleInfo = info.split(",");
                
                if (Integer.valueOf(singleInfo[1]) > age) {
                    age = Integer.valueOf(singleInfo[1]);
                    name = singleInfo[0];
                }
                
            } else {
                break;
            }
            System.out.println("Name fo the oldest: " + name);
        }
    }
}
