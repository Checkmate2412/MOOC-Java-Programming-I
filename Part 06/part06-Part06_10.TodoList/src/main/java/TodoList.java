
import java.util.ArrayList;


public class TodoList {
    private ArrayList<String> list;

    public TodoList() {
        this.list = new ArrayList<>();
    }
     
    public void add(String task) {
        this.list.add(task);
    }
    
    public void print() {
        for (String task : list) {
            System.out.println((this.list.indexOf(task) + 1) + ": " + task);
        }
    }
    
    public void remove(int number) {
        this.list.remove(number - 1);
    }
}
