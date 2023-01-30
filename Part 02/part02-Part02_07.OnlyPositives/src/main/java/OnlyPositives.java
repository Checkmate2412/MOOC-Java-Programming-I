
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Give a number:");
            int n1 = Integer.valueOf(scanner.nextLine());
            
            if (n1 == 0) {
                break;
            } 
            
            if (n1 < 0){
                System.out.println("Unsuitable number");
                continue;
            }
            
            System.out.println(n1 * n1);
        }
    }
}
