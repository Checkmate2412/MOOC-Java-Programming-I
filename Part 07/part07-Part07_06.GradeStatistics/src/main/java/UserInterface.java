
import java.util.Scanner;


public class UserInterface {
    private Scanner scan;
    private Statistics statistics;

    public UserInterface() {
        this.scan = new Scanner(System.in);
        this.statistics = new Statistics();
    }
    
    public void TextUI() {
        System.out.println("Enter point totals, -1 stops");
        while (true) {            
            int input = Integer.valueOf(scan.nextLine());
            
            if (input == -1)
                break;
            
            if (input >= 0 && input <= 100)
                this.statistics.add(input);
        }
        this.print();
    }
    
    public void print() {
        System.out.println("Point average (all): " + statistics.pointAverage());     
        System.out.println("Point average (passing): " + statistics.passingPointAverage());
        System.out.println("Pass percentage: " + statistics.percentage());
        System.out.println("Grade distribution: " + statistics.gradeDistribution());
    }
}
