
public class Printer {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        // Write some code in here
        for (int i = 0; i <= array.length - 1; i++) {
            for (int j = 1; j <= array[i]; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

}
