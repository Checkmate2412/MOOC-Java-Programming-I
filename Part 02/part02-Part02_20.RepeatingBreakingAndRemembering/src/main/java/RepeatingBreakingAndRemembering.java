
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);
        int input, sum = 0, num = 0, even = 0, odd = 0;
        double avg = 0;
        
        System.out.println("Give numbers:");
         
        while (true) {
            input = Integer.valueOf(scanner.nextLine());
            
            if (input == -1) {
                break;
            }
            
            if (input % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            
            sum += input;
            num++;
        }
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + num);
        System.out.println("Average: " + (sum / (double)num));
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
