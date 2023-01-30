
public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
    }

    public static int smallest(int[] array) {
        int num = array[0];
        
        for (int i : array) {
            if (i < num)
                num = i;
        }
        return num;
    }
    
    public static int indexOfSmallest(int[] array) {
       int num = smallest(array);
       int index = 0;
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                index = i;
                break;
            }
        }
       return index;
    }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int index = startIndex;
        int number = table[index];
        for (int i = startIndex; i < table.length; i++) {
            if (table[i] < number) {
                index = i;
                number = table[i];
            }
        }
        return index;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
    
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            swap(array, i, indexOfSmallestFrom(array, i));
        }
    }
}
