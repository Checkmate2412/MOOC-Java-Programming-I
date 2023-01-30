
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;


public class UserInterface {
    private ArrayList<Recipe> recipe;
    private Scanner scan;
    
    public UserInterface() {
        this.recipe = new ArrayList<>();
        this.scan = new Scanner(System.in);
    }
    
    public void uiText() {
        this.readFile();
        this.command();
        this.userInput();
    }
    
    private void userInput() {
        while (true) {            
            System.out.println("Enter command: ");
            String cmd = scan.nextLine();
            
            if (cmd.equals("list"))
                this.printList();
            else if (cmd.equals("find name"))
                this.findName();
            else if (cmd.equals("find cooking time"))
                this.findCookingTime();
            else if (cmd.equals("find ingredient"))
                this.findIngredients();
            
            if (cmd.equals("stop"))
                break;
        }
    }
    
    private void command() {
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
    }
    
    private void readFile() {
        System.out.println("Files to read:");
        String fileName = this.scan.nextLine();
        ArrayList<String> recipeList = new ArrayList<>();
        
        try (Scanner fileScan = new Scanner(Paths.get(fileName))){   
            while (fileScan.hasNextLine()) {
                recipeList.add(fileScan.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        
        this.insertRecipe(recipeList);
    }
    
    private void insertRecipe(ArrayList<String> recipeList) {
        int loop = 0, time = 0;
        String name = "";
        ArrayList<String> ingredients = new ArrayList<>();
        recipeList.add("");
        
        for (String recipeListString : recipeList) {
            if (recipeListString.isEmpty()) {
                this.recipe.add(new Recipe(name, time, ingredients));
                name = "";
                loop = 0;
                time = 0;
                ingredients = new ArrayList<>();
                continue;
            }
            
            if (loop == 0)
                name = recipeListString;
            else if (loop == 1)
                time = Integer.valueOf(recipeListString);
            else 
                ingredients.add(recipeListString);    
            
            loop++;
        }
    }
    
    private void printList() {
        System.out.println("\nRecipes:");
        for (Recipe recipeList : recipe) {
            System.out.println(recipeList.toString());
        }
    }
    
    private void findName() {
        System.out.println("Searched word: ");
        String search = scan.nextLine();
        
        System.out.println("\nRecipes:");
        for (Recipe recipeList : recipe) {
            if (recipeList.getName().contains(search)) 
                System.out.println(recipeList.toString());
        }
    }
    
    private void findCookingTime() {
        System.out.println("Max Cooking Time: ");
        int search = Integer.valueOf(scan.nextLine());
        
        System.out.println("Recipes:");
        for (Recipe recipeList : recipe) {
            if (search >= recipeList.getTime()) 
                System.out.println(recipeList.toString());
        }
    }
    
    private void findIngredients() {
        System.out.println("Ingredient: ");
        String search = scan.nextLine();
        System.out.println("\nRecipes:");
        for (Recipe recipeList : recipe) {
            if (recipeList.getIngredients().contains(search)) 
                System.out.println(recipeList.toString());
        }
    }
}
