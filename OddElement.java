import java.util.*;
public class OddElement {
    public static void main(String[] args) {
        int[][] array = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Odd elements in the array:");

        // Iterate through each element of the array
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                // Check if the element is odd
                if (array[i][j] % 2 != 0) {
                    System.out.println("Element at index [" + i + "][" + j + "]: " + array[i][j]);
                }
            }
        }
    }
}
