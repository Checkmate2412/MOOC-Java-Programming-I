
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        //write some code here
        int temp = number1;

        if (number2 > number1) {
            temp = number2;
        } 
        if (number3 > temp) {
            temp = number3;
        } 
        return temp;
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}
