
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n1 = Integer.valueOf(scanner.nextLine());
        
        if (n1 < 0) {
            System.out.println(Math.abs(n1));
        } else {
            System.out.println(n1);
        }
    }
}
