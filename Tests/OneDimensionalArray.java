import java.util.Scanner;

public class OneDimensionalArray  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the data
        System.out.print("Enter the size of the data: ");
        int n = scanner.nextInt();

        // Input the data elements
        int[] data = new int[n];
        System.out.println("Enter the data elements:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            data[i] = scanner.nextInt();
        }

        // Calculate sum, mean, and standard deviation
        int sum = 0;
        int count = 0;
        //int value = 0;
        for (int i = 0; i < data.length; i++) { // Used the conventional for loop instead of for each loop
            if (data[i] % 5 == 0) {
                sum += data[i];
                count++;
            }
        }

        // Calculate mean
        double mean = (double) sum / count;

        // Calculate standard deviation
        //double deviationSum = 0;
        //for (int value : data) {
        //    if (value % 5 == 0) {
        //        deviationSum += Math.pow(value - mean, 2);
        //    }
        //}
        //double standardDeviation = Math.sqrt(deviationSum / count);

        // Display results
        System.out.println("Sum of multiples of 5: " + sum);
        System.out.println("Mean of multiples of 5: " + mean);
        //System.out.println("Standard Deviation of multiples of 5: " + standardDeviation);

        System.exit(0);
    }
}