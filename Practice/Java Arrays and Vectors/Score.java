// A comprehensive program on the creation, manipulation, sorting and searching of data in a linear array

import java.util.*;
public class Score {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the number of data");
        int n = input.nextInt();

        int score [] = new int [n]; // Declaring or creating score array of size n

        int sum = 0; // Accumulator for summing data in the array
        int i;
        for (i=0; i<n; i++) {
            System.out.println ("Enter data at location " + (i+1));
            score [i] = input.nextInt();
            sum += score[i];
        } // Next data

        System.out.println("Total sum=" +sum);

        double mean = (double)sum/n;
        System.out.println("The mean = " +mean);

        //Sorting the array using the intrinsic function: Arrays.sort();
        // Arrays.sort() sorts all data in ascending order
        Arrays.sort(score);

        System.out.println("\nSorted array....... \n\n");
        for(i=0; i<n; i++)
        System.out.print(score[i] + ""); //Printint the array elements

        // To search for a data in the arrray
        System.out.println("\n\nSearching for a data, \n\n Enter the data to search\n");
        int x = input.nextInt();
        boolean found = false; // to determine if the data is found 
        // Remember, boolean is one of the primitive types
        for (i=0; i<n; i++) {
            if(score[i] == x) { //Note the use of == for testing equality
                found = true;
                System.out.println("\n" + x + " is found in location (s)" + (i+1));

            } // end if
        } // next location i
        
        if (found == false) // Data not found
           System.out.println (x + "is not found in the array");
        
        // Computing standard deviation of the data in the array
        double  numerator = 0; // Declaring an accumulator

        for (i=0; i< score.length; i++) // Accumulating the squared deviations 
        numerator += Math.pow(score[i] - mean, 2);

        double var = numerator /n; // The variance 
        
        double std = Math.sqrt(var); // The standard deviation 

        System.out.println("\n\n The Standard deviation of the data in the array = \n\n");

        // printf function is used to format the output to 2 decimal places 

        System.out.printf("\n\n %.2f", std);

        System.out.println("\n\nThanks for using this simple application on one dimensional array");
        System.exit(0);
    }
}