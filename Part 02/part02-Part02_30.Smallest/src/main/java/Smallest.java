
public class Smallest {

    public static int smallest(int number1, int number2) {
        // Write some code here
        // don't print anything inside this method
        // there must be a return in the end of the method
        int pass = 0;
        
        if (number2 > number1){
            pass = number1;
        } else if (number1 > number2) {
            pass = number2;
        } 
        return pass;
    }

    public static void main(String[] args) {
        int result = smallest(2, 7);
        System.out.println("Smallest: " + result);
    }
}
