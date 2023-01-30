
import java.util.Scanner;


public class TextUI {
    private Scanner scan;
    private SimpleDictionary simpleDictionary;

    public TextUI(Scanner scan, SimpleDictionary simpleDictionary) {
        this.scan = scan;
        this.simpleDictionary = simpleDictionary;
    }
    
    public void start() {
        while (true) {            
            System.out.println("Command: ");
            String command = scan.nextLine();
            
            if(command.equals("end")) {
                this.end();
                break;
            } else if (command.equals("add")) 
                this.add();
            else if (command.equals("search")) 
                this.search();
            else 
                System.out.println("Unknown command");
        }
    }
    
    public void end() {
        System.out.println("Bye bye!");
    }
    
    public void add() {
        System.out.println("Word:");
        String word = scan.nextLine();
        System.out.println("Translation:");
        String translation = scan.nextLine();
        this.simpleDictionary.add(word, translation);
    }
    
    public void search() {
        System.out.println("To be translated:");
        String word = scan.nextLine();
        
        if (this.simpleDictionary.translate(word) != null) {
            System.out.println("Translation:");
            System.out.println(this.simpleDictionary.translate(word));
        }
        else
            System.out.println("Word " + word + " was not found");               
    }
}
