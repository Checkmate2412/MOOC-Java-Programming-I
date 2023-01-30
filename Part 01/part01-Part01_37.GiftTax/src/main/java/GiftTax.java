
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Value of the gift?");
        int val = Integer.valueOf(scan.nextLine());
        
        if (val >= 0 && val <= 4999) {
            System.out.println("No tax!");
        } else if (val >= 5000 && val <= 24999) {
            System.out.println("Tax: " + (100 + (val - 5000) * 0.08));
        } else if (val >= 25000 && val <= 54999) {
            System.out.println("Tax: " + (1700 + (val - 25000) * 0.10));
        } else if (val >= 55000 && val <= 199999) {
            System.out.println("Tax: " + (4700 + (val - 55000) * 0.12));
        } else if (val >= 200000 && val <= 999999) {
            System.out.println("Tax: " + (22100 + (val - 200000) * 0.15));
        } else {
            System.out.println("Tax: " + (142100 + (val - 1000000) * 0.17));
        } 
    }
}
