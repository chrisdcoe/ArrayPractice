
package arraypractice;

import java.lang.reflect.Array;
import java.util.Arrays;


public class ArrayPractice {

    public static <E> void printArray(E[] array) {
        for (E element : array) {
            System.out.print(element + ", ");
        }
        System.out.println();
    }
            
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Declaring, Allocating, Initializing
        Integer[] intArray1;
        Integer[] intArray2 = new Integer[4];
        printArray(intArray2);
        Integer[] intArray3 = {5, 2, 9, 1, 3};
        
        String[] shoppingList = {"bananas", "apples", "pears"};
        
        intArray2[0] = 10;
        intArray2[1] = 8;
        intArray2[2] = 5;
        intArray2[3] = 10;
        
        
        // Print out arrays
        System.out.println(Arrays.toString(intArray2));
        System.out.println(Arrays.toString(intArray3));
        System.out.println();
        
        // Custom print out arrays
        printArray(intArray2);
        printArray(intArray3);
        System.out.println();
        
        // Retrieve objects
        System.out.println(intArray2[3]);
        System.out.println(Array.get(intArray2, 2));
        System.out.println();
        
        // Given functions
        Arrays.sort(intArray3);
        printArray(intArray3);
        System.out.println();
        
        System.out.println("Special FOR loop:");
        // Special for loop: foreach
        for (String s : shoppingList) {
            System.out.println(s);
        }
        
    }
    
}
