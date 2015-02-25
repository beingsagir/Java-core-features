package genericclass;

/**
 * Created by Sagiruddin on 2/25/2015.
 */
public class JavaGenericClass {
    public static <E> void printArray (E[] inputArray){
        // Display array elements
        for (E element: inputArray){
            System.out.printf("%s", element);
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        Integer[] intArray = {23, 22, 34, 21};
        Double[] doubleArray = {1.2, 1.1, 4.2};
        Character[] charArray = { 'H', 'E', 'Y'};

        System.out.printf("Array of intger :");
        printArray(intArray);

        System.out.printf("Array of Double :");
        printArray(doubleArray);

        System.out.printf("Array of Character :");
        printArray(charArray);
    }
}
