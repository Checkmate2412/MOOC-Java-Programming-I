
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    @Override
    public String toString() {
        String printString = "The collection " + this.name;
        
        if (this.getElements().isEmpty()) 
            return printString + " is empty.";
        
        if (this.getElements().size() == 1) 
            printString += " has 1 element:";
        else
            printString += " has " + this.getElements().size() + " elements:";
        
        for (String element : this.getElements()) {
            printString += "\n" + element;
        }
        
        return printString;
    } 
}
