
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String sentence = scanner.nextLine();
            
            if (!sentence.isEmpty()) {
                String[] sList = sentence.split(" ");
            
                for (String word : sList) {
                    System.out.println(word);
                }
            } else {
                break;
            }
            
        }
    }
}
