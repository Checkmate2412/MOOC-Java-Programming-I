
import java.util.ArrayList;


public class Suitcase {
    private int maxTotalWeight;
    private ArrayList<Item> items = new ArrayList<Item>();
    private int totalWeight;

    public Suitcase(int maxTotalWeight) {
        this.maxTotalWeight = maxTotalWeight;
    }

    public int totalWeight() {
        return this.totalWeight;
    }
    
    public Item heaviestItem() {
        Item heaviestItem = new Item("", 0);

        if (this.items.isEmpty())
            return null;
        
        for (Item item : items) {
            if (item.getWeight() > heaviestItem.getWeight())
                heaviestItem = item;
        }
        
        return heaviestItem;
    }
    
    public void printItems() {
        for (Item item : items) {
            System.out.println(item.getName() + " (" + item.getWeight() + " kg)");
        }
    }
       
    public void addItem(Item item) {
        int weight = totalWeight + item.getWeight();
        
        if (weight <= maxTotalWeight) {
            this.items.add(item);
            totalWeight = weight;
        }
    }
    
    @Override
    public String toString() {
        String printString = "no items";
        
        if (this.items.size() > 1)
            printString = this.items.size() + " items";
        else if (this.items.size() == 1)
            printString = "1 item";

        return printString + " (" + this.totalWeight + " kg)";
    }
    
    
}
 