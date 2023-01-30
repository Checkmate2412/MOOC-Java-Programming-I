
import java.util.Scanner;

public class UserInterface {
    private JokeManager manager;
    private Scanner scan;

    public UserInterface(JokeManager manager, Scanner scan) {
        this.manager = manager;
        this.scan = scan;
    }
    
    public void start() {
        while (true) {            
            System.out.println("Commands: \n"
                    + "1 - add a joke\n"
                    + "2 - draw a joke\n"
                    + "3 - list jokes\n"
                    + "X - stop");
            
            String input = scan.nextLine();
            
            if (input.equals("X"))
                break;
            
            processCommand(input);
        }
    }
    
    public void processCommand(String input) {
        if(input.equals("1")) {
            System.out.println("Write the joke to be added:");
            String add = scan.nextLine();
            this.manager.addJoke(add);
        } else if (input.equals("2"))
            System.out.println(this.manager.drawJoke());
        else if (input.equals("3")) 
            this.manager.printJokes();
    }
}
