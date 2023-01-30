
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0, sum = 0;
        
        while (true){
            System.out.println("Give a number:");
            int val = Integer.valueOf(scanner.nextLine());
            
            if (val != 0){
                sum += val;
                num++;
                continue;
            } else {
                break;
            }
        }
        System.out.println("Average of the numbers: " + ((double) sum / num));
    }
}
