
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

    public String longest() {
        String returnString = "";
        
        if (this.elements.isEmpty())
            return null;
        
        for (String element : elements) {
            if (element.length() > returnString.length())
                returnString = element;
        }
        
        return returnString;
    }
    
    public ArrayList<String> getElements() {
        return this.elements;
    }

}
