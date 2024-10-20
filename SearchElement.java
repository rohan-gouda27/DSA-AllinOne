import java.util.*;
public class SearchElement {
    public static void main(String[] args) {
        int[][] array = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int target = 5; // Element to search

        boolean found = false;
        int rowIndex = -1;
        int colIndex = -1;

        // Iterate through each element of the array
        outerloop:
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == target) {
                    found = true;
                    rowIndex = i;
                    colIndex = j;
                    break outerloop; // Break out of both loops when element is found
                }
            }
        }

        if (found) {
            System.out.println("Element " + target + " found at index [" + rowIndex + "][" + colIndex + "]");
        } else {
            System.out.println("Element " + target + " not found in the array");
        }
    }
}
