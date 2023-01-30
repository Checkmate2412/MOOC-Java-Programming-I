
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] uList = new String[2];
        uList[0] = "alex";
        uList[1] = "emma";
        
        String[] pList = new String[2];
        pList[0] = "sunshine";
        pList[1] = "haskell";
        
        System.out.println("Enter username: ");
        String uname = scanner.nextLine();
        System.out.println("Enter password: ");
        String pwd = scanner.nextLine();
        
        if (uname.equals(uList[0]) || uname.equals(uList[1])) {
            if(pwd.equals(pList[0]) || pwd.equals(pList[1])) {
                System.out.println("You have successfully logged in!");
            } else {
                System.out.println("Incorrdect username or password!");
            }
        } else {
            System.out.println("Incorrect username or password!");
        }       
    }
}
