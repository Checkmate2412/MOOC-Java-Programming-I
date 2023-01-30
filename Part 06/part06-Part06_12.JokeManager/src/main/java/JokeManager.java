
import java.util.ArrayList;
import java.util.Random;

public class JokeManager {
    private ArrayList<String> jokeList;

    public JokeManager() {
        this.jokeList = new ArrayList<>();
    }
    
    public void addJoke(String joke) {
        System.out.println("Write the joke to be added:");
        this.jokeList.add(joke);
    }
    
    public String drawJoke() {
        if(this.jokeList.isEmpty())
            return "Jokes are in short supply.";
        
        System.out.println("Drawing a joke.");
        Random rand = new Random();
        return this.jokeList.get(rand.nextInt(this.jokeList.size()));
    }
    
    public void printJokes() {
        if(this.jokeList.isEmpty())
            System.out.println("Jokes are in short supply.");
        else {
            System.out.println("Printing the jokes.");
            for (String joke : jokeList) 
                System.out.println(joke); 
        }
    }
}
