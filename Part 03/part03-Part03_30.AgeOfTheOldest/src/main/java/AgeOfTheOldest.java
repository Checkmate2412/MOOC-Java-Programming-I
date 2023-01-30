
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;
        
        while (true) {            
            String input = scanner.nextLine();
            
            if(!input.isEmpty()) {
                String[] group = input.split(",");
                
                if (Integer.valueOf(group[1]) > oldest) {
                    oldest = Integer.valueOf(group[1]);
                }
                
            } else {
                break;
            }
        }
        
        System.out.println("Age of the oldest: " + oldest);
    }
}
