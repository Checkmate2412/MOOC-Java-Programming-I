
public class Item {
    private String identifier, name;
   
    public Item(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        
        if (!(obj instanceof Item))
            return false;
        
        Item compare = (Item) obj;
        
        return this.identifier.equals(compare.identifier);
        
    }

    @Override
    public String toString() {
        return this.identifier + ": " + this.name;
    }
    
    
}
