
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int game = 0, lose = 0, win = 0;
        ArrayList<Sport> records = new ArrayList<>();
        
        System.out.println("File: ");
        String file = scan.nextLine();
        System.out.println("Team: ");
        String team = scan.nextLine();
        
        try (Scanner scanFile = new Scanner(Paths.get(file))) {
            while (scanFile.hasNextLine()) {   
                String[] info = scanFile.nextLine().split(",");
                if (info[0].equals(team) || info[1].equals(team)) {
                    records.add(new Sport(info[0], info[1], 
                        Integer.valueOf(info[2]), Integer.valueOf(info[3])));
                    game++;
                } 
            }  
            
            for (Sport record : records) {
                if (record.getHomeTeam().equals(team)) {
                    if (record.getHomePoints() > record.getVisitPoints()) 
                        win++;
                    else
                        lose++;
                } else if (record.getVisitTeam().equals(team)) {
                    if (record.getVisitPoints() > record.getHomePoints()) 
                        win++;
                    else
                        lose++;
                }
            }
            
        } catch (Exception e) {
            System.out.println("Error: "  + e.getMessage());
        }
        System.out.println("Games: " + game);
        System.out.println("Wins: " + win);
        System.out.println("Losses: " + lose);
    }
}
