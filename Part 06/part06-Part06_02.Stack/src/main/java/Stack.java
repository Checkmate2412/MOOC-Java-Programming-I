import java.util.ArrayList;

public class Stack {
    private ArrayList<String> stack = new ArrayList<>();
    
    public void add(String value) {
        this.stack.add(value);
    }
    
    public ArrayList<String> values() {
        return this.stack;
    }
    
    public boolean isEmpty() {
        return stack.isEmpty();
    }
    
    public String take(){
        String value = this.stack.get(this.stack.size() - 1);
        this.stack.remove(this.stack.size() - 1 );
        return value;
    }
    
}
