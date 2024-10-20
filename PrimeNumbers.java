import java.util.*;
public class PrimeNumbers {
    public static void main(String[] args) {
        int[][] array = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Prime numbers in the array:");

        // Iterate through each element of the array
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                // Check if the element is prime
                if (isPrime(array[i][j])) {
                    System.out.println("Element at index [" + i + "][" + j + "]: " + array[i][j]);
                }
            }
        }
    }

    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
