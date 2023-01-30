
import java.util.ArrayList;
import java.util.Scanner;


public class UserInterface {
    private Scanner scan;
    private ArrayList<BirdData> birdData;

    public UserInterface() {
        this.scan = new Scanner(System.in);
        this.birdData = new ArrayList<>();
    }
    
    public void uiText() {
        while (true) {            
            System.out.println("?");
            String cmd = scan.nextLine();
            
            if (cmd.equals("Quit"))
                break;
            
            if (cmd.equals("Add")) {
                this.add();
            } else if (cmd.equals("Observation")) {
                this.observation();
            } else if (cmd.equals("All")) {
                this.all();
            } else if (cmd.equals("One")) {
                this.one();
            }
        }
    }
    
    private void add() {
        System.out.println("Name:");
        String name = scan.nextLine();
        System.out.println("Name in Latin:");
        String latin = scan.nextLine();
        birdData.add(new BirdData(name, latin));
    }
    
    private void observation() {
        System.out.println("Bird? ");
        String input = scan.nextLine();
        
        for (BirdData birdData1 : birdData) {
            if (birdData1.getName().equals(input)) {
                birdData1.add();
                break;
            }     
        }
    }
    
    private void all() {
        for (BirdData birdData1 : birdData) 
            System.out.println(birdData1.toString());
    }
    
    private void one() {   
        System.out.println("Bird? ");
        String input = scan.nextLine();
        
        for (BirdData birdData1 : birdData) {
            if (birdData1.getName().equals(input)) {
                System.out.println(birdData1.toString());
                break;
            }     
        }
    }
}
