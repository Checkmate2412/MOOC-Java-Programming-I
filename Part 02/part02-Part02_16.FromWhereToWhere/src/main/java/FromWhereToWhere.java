
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Where to? ");
        int val = Integer.valueOf(scanner.nextLine());
        System.out.println("Where from? ");
        int val1 = Integer.valueOf(scanner.nextLine());
        
        if (val >= val1) {
            System.out.println(true);
            for(int i = val1; i <= val; i++){
                System.out.println(i);
            }  
        }       
    }
}
