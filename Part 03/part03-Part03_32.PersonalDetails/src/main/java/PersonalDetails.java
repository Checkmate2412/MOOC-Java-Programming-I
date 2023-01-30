
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double avg = 0;
        int sum = 0, count = 0;
        String longName = "";

        
        while (true) {
            String info = scanner.nextLine();
            
            if(!info.isEmpty()) {
                String[] singleInfo = info.split(",");
                if (singleInfo[0].length() > longName.length()) {
                    longName = singleInfo[0];
                } 
                                
                sum += Integer.valueOf(singleInfo[1]);
                count++;   
            } else {
                break;
            }
        }
        
        avg = sum / (double) count;
        System.out.println("Longest name: " + longName);
        System.out.println("Average of the birth years: " + avg);
    }
}
