// Print the average of an array filled with random numbers
// Tests if an array contains a specific value
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Fills the array with random numbers
        int[] arr = new int [5];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt();
        }
        // Initializes a variable 'sum' to store the sum of array
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        // Calculates the average and prints the result
        double avg = (double) sum /arr.length;
        System.out.println("Average: " + avg);
        // Determines if the array contains an item and prints the result
        int[] myArray = {1789, 2035, 1899, 1456, 2013};
        System.out.println(contains(myArray, 2013));
    }
    public static boolean contains (int[] array, int item) {
        for (int n : array) {
            if (item == n) {
                return true;
            }
        }
        return false;
    }
}