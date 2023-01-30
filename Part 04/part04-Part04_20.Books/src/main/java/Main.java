import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        
        ArrayList<Book> books = new ArrayList<Book>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {            
            System.out.println("Title: ");
            String name = scanner.nextLine();
            
            if (name.isEmpty())
                break;
            
            System.out.println("Pages: ");
            String pages = scanner.nextLine();
            System.out.println("Publication year: ");
            String year = scanner.nextLine();
            
            books.add(new Book(name, pages, year));
        }
        
        System.out.println("What information will be printed? ");
        String input = scanner.nextLine();
        
        for (Book book : books) {
            if (input.equals("everything"))
                System.out.println(book);
            else
                System.out.println(book.getName());
                
        }
    }
}
