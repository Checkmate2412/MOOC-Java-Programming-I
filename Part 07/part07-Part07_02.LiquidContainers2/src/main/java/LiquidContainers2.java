
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container container1 = new Container();
        Container container2 = new Container();

        while (true) {
            System.out.println("First: " + container1.contains() + "/100");
            System.out.println("Second: " + container2.contains() + "/100");
            
            String input = scan.nextLine();
            if (input.equals("quit")) 
                break;
            
            String[] command = input.split(" ");
            String cmd = command[0];
            int amount = Integer.valueOf(command[1]);
            
            if (cmd.equals("add"))
                container1.add(amount);
            else if (cmd.equals("remove"))
                container2.remove(amount);
            else if (cmd.equals("move"))
                container1.move(amount, container2);
        }
    }

}
