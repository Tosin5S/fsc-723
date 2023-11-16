/**
 * Write a program to compute the sum and mean of all odd
 * data elements in a linear array
 */

public class SumAndMeanOfOddElements {
    public static void main(String[] args) {
        // Sample array
        int[] dataArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Compute sum and mean of odd elements
        int sumOfOdd = 0;
        int countOfOdd = 0;

        for (int num : dataArray) {
            if (num % 2 != 0) { // Check if the number is odd
                sumOfOdd += num;
                countOfOdd++;
            }
        }

        double meanOfOdd = (double) sumOfOdd / countOfOdd;

        // Display results
        System.out.println("Array: " + java.util.Arrays.toString(dataArray));
        System.out.println("Sum of odd elements: " + sumOfOdd);
        System.out.println("Mean of odd elements: " + meanOfOdd);
    }
}
