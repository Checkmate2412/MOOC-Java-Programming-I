
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Name of the file: ");
        String file = scanner.nextLine();
        
        try (Scanner fileScan = new Scanner(Paths.get(file))){
            while(fileScan.hasNextLine()) {
                String[] splitString = fileScan.nextLine().split(",");
                int ageInt = Integer.valueOf(splitString[1]);
                String age = ageInt != 1 ? "years" : "year";
                
                System.out.println(splitString[0] + ", age: " + ageInt + " " + age);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
