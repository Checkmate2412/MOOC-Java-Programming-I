
import java.util.ArrayList;


public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> suitcase = new ArrayList<Suitcase>();
    private int totalWeight;
            
    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
    }
    
    public void addSuitcase(Suitcase suitcase) {
        int weight = totalWeight + suitcase.totalWeight();
        
        if (weight <= maxWeight) {
            this.suitcase.add(suitcase);
            totalWeight = weight;
        }
    }

    public void printItems() {
        for (Suitcase suitcase1 : suitcase) {
            suitcase1.printItems();
        }
    }
    
    @Override
    public String toString() {
        return suitcase.size() + " suitcases (" + totalWeight + " kg)";
    }
    
    
}
