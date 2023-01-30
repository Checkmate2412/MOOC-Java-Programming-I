
public class BirdData {
    private String name, latin;
    private int observation;
    
    public BirdData(String name, String latin) {
        this.name = name;
        this.latin = latin;
        this.observation = 0;
    }

    public String getName() {
        return this.name;
    }

    public void add() {
        this.observation++;
    }

    @Override
    public String toString() {
        return this.name + "(" + this.latin + "): " 
                + this.observation + " observations";
    }
}
