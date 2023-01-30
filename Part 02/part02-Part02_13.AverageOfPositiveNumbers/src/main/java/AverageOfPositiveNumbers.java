
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0, sum = 0;
        
        while (true){
            int val = Integer.valueOf(scanner.nextLine());
            
            if (val > 0) {
                sum += val;
                num++;
            } else if (val == 0) {
                break;
            }
        }
        
        if (num == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println((sum / (double)num));
        }
    }
}
