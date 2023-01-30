
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        
        int num = 0;
        
        while(true) {
            System.out.println("Give a number:");
            int val = Integer.valueOf(scanner.nextLine());
            
            if (val < 0) {
                num++;
            } else if (val == 0) {
                break;
            } else {
                continue;
            }
        }
        System.out.println("Number of negative numbers: " + num);
    }
}
