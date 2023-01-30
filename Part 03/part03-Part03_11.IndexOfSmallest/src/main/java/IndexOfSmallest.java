
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        ArrayList<Integer> list = new ArrayList<>();
        while(true) {
            int num = Integer.valueOf(scanner.nextLine());
            
            if (num == 9999) {
                break;
            }
            
            list.add(num);
        }
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times

        int number = list.get(0);
        
        for (int i = 1; i <= list.size() - 1; i++) {
            if (list.get(i) < number) {
                number = list.get(i);
            }
        }
        System.out.println("Smallest number: " + number);
        
        for (int j = 0; j <= list.size() - 1; j++) {
            if (number == list.get(j)) {
                System.out.println("Found at index: " + j);
            }
        }
    }
}
