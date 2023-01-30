
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        for (int i = 1; i <= number; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        for (int i = 1; i <= number; i++) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        int space = 0;
        for (int i = 1; i <= size; i++) {
           
            space = size - i;
            
            for (int j = space; j >= 1; j--) {
                System.out.print(" ");
            }
            
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            
            System.out.println("");
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        int num = 1;
        for (int i = 1; i <= height; i++) {
            printSpaces(height - i);
            
            if (i != 1){
                num += 2;
            }
            printStars(num);         
        }
        
        for (int i = 1; i <= 2; i++) {
            printSpaces(height - 2);
            printStars(3);           
        }
        
    }
    
    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.
        printSpaces(1);
        System.out.println("---");
        printStars(3);
        System.out.println("---");
        printTriangle(1);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
