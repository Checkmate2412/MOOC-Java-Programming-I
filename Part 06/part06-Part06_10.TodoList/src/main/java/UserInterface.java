
import java.util.Scanner;


public class UserInterface {
    private TodoList todoList;
    private Scanner scan;

    public UserInterface(TodoList todoList, Scanner scan) {
        this.todoList = todoList;
        this.scan = scan;
    }
    
    public void start() {
        while (true) {            
            System.out.println("Command: ");
            String command = scan.nextLine();
            
            if (command.equals("stop")) 
                break;
            
            this.processCommand(command);
        }
    }
    
    public void processCommand(String command) {
        if (command.equals("add")) 
            this.add();
        else if (command.equals("list"))
            this.printList();
        else if (command.equals("remove"))
            this.remove();
    }
    
    public void add() {
        System.out.println("To add: ");
        String addString = scan.nextLine();  
        this.todoList.add(addString);
    }
    
    public void remove() {
        System.out.println("Which one is removed? ");
        int remove = Integer.valueOf(scan.nextLine());
        this.todoList.remove(remove);
    }
    
    public void printList() {
        this.todoList.print();
    }
}
