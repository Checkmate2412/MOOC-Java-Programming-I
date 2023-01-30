
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalnum = 0; 
        
        while (true) {
            System.out.println("Give a number:");
            int val = Integer.valueOf(scanner.nextLine());
            
            if (val != 0) {
                totalnum++;
                continue;
            } else {
                break;
            }
        }
        
        System.out.println("Number of numbers: " + totalnum);
    }
}
