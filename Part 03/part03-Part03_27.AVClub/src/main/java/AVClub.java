
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {            
            String sentence = scanner.nextLine();
                        
            if (!sentence.isEmpty()) {
                String[] wordGroup = sentence.split(" ");
                
                for (String word : wordGroup) {
                    if (word.contains("av")) {
                        System.out.println(word);
                    }
                }              
                continue;
            } else {
                break;
            }
        }
    }
}
