
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {            
            String sentence = scanner.nextLine();
            
            if(!sentence.isEmpty()) {
                String[] word = sentence.split(" ");
                System.out.println(word[word.length - 1]);
                
            } else {
                break;
            }
        }
    }
}
