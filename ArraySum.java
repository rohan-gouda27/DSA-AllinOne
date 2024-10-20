import java.util.*;
public class ArraySum{
    public static void main(String[] args) {
        int[][] array1 = {
            {1, 2, 3},
            {4, 5, 6}
        };
        
        int[][] array2 = {
            {7, 8, 9},
            {10, 11, 12}
        };

        // int rows = array1.length;
        // int columns = array1[0].length;

        // Create a new array to store the sum
        int[][] resultArray = new int[array1.length][array1[0].length];

        // Iterate through each element and calculate the sum
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[0].length; j++) {
                resultArray[i][j] = array1[i][j] + array2[i][j];
            }
        }

        // Display the result
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[0].length; j++) {
    
                System.out.print(resultArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
